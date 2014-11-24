package main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import process.ProcessFactory;
import trace.Step;
import trace.Trace;
import trace.TracePackage;

public class TraceDebugger {
	static Logger logger = Logger.getLogger("TraceDebugger");

	public static void main(String[] args) {
		//Do some basic checks
		if (args.length == 0) {
			System.out.println("Please specify a trace file as an argument");
			System.exit(1);
		}

		
		String filename = args[0];
		File inputFile = new File(filename);
		if (!inputFile.exists()) {
			System.out.println("File " + filename + " not found.");
			System.exit(-1);
		}
		initializeLog(inputFile.getParentFile());
		//Transform the counter example trace then load it as a Process
		File traceFile = transformCounterExample(filename);
		if (traceFile == null)
			System.exit(-1);
		process.Process process = createProgramRepresentation(loadTrace(traceFile));

		//Start the real work
		Scanner scan = new Scanner(new InputStreamReader(System.in));
		try {
			new InterpreterLoop(process, scan, System.out, logger).run();
		} catch(Exception e) {
			logger.log(Level.SEVERE, "Exception occured", e);
		}
		System.exit(0);
	}

	private static File transformCounterExample(String filename) {
		Source xmlInput = new StreamSource(filename);
		InputStream xslt = ClassLoader.getSystemResourceAsStream("traceTransform.xsl");
		if (xslt == null) {
			logger.log(Level.SEVERE, "traceTransform.xsl not found");
			return null;
		}
		Source xsl = new StreamSource(xslt);
		File transformResult = new File(filename + ".emf.xml");
		Result xmlOutput = new StreamResult(transformResult);
		Transformer transformer;
		try {
			transformer = TransformerFactory.newInstance().newTransformer(xsl);
			transformer.transform(xmlInput, xmlOutput);
			return transformResult;
		} catch (TransformerException e) {
			logger.log(Level.SEVERE, "Error transforming " + filename);
		} catch (TransformerFactoryConfigurationError e) {
			logger.log(Level.SEVERE, "Error transforming " + filename);
		}
		try {
			xslt.close();
		} catch (IOException e) {
			//Should not happen
		}
		return null;
	}

	public static Trace loadTrace(File traceFile) {
		@SuppressWarnings("unused")
		TracePackage p = TracePackage.eINSTANCE;
		URI uri = URI.createFileURI(traceFile.getAbsolutePath());
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new XMLResourceFactoryImpl());
		Resource resource = resSet.getResource(uri, true);
		return (Trace) resource.getContents().get(0);
	}

	private static void initializeLog(File loggingFolder) {
		logger.setUseParentHandlers(false);
		FileHandler fh;
		try {
			fh = new FileHandler(loggingFolder + "/traceDebugger.log", true);
			logger.addHandler(fh);
			logger.setLevel(Level.ALL);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
		} catch (SecurityException e) {
			// Can'tbe
		} catch (IOException e) {
			return; // Ignore the exception
		}
	}

	public static process.Process createProgramRepresentation(trace.Trace trace) {
		// create process object
		process.Process process = ProcessFactory.eINSTANCE.createProcess();

		//Process each step to assign it to its thread
		EList<Step> steps = trace.getSteps();
		for (Step step : steps) {
			// Create thread if it does not exist
			process.Thread thread = null;
			if (process.getThreads().size() >= step.getThread() + 1)
				thread = process.getThreads().get(step.getThread());

			if (thread == null) {
				thread = ProcessFactory.eINSTANCE.createThread();
				thread.setId(step.getThread());
				process.getThreads().add(thread.getId(), thread);
			}
			thread.getAllSteps().add(step);
		}
		return process;
	}

}