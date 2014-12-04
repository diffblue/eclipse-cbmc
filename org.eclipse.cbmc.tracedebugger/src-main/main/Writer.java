package main;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import trace.Assignment;
import trace.SimpleValue;
import trace.StructValue;
import trace.Trace;
import trace.TraceFactory;

public class Writer {
	public static void main(String[] args) {

		Assignment s = TraceFactory.eINSTANCE.createAssignment();
		{
			SimpleValue v = TraceFactory.eINSTANCE.createSimpleValue();
			v.setValue("123");
			s.setValue(v);
		}

		Assignment s2 = TraceFactory.eINSTANCE.createAssignment();
		{
			SimpleValue sv = TraceFactory.eINSTANCE.createSimpleValue();
			sv.setValue("345");
			StructValue v2 = TraceFactory.eINSTANCE.createStructValue();
			v2.getValues().put("myKey", sv);
			s2.setValue(v2);
		} 

		Assignment s3 = TraceFactory.eINSTANCE.createAssignment();
		{
			SimpleValue sv = TraceFactory.eINSTANCE.createSimpleValue();
			sv.setValue("345");
			SimpleValue sv2 = TraceFactory.eINSTANCE.createSimpleValue();
			sv2.setValue("678");
			
			StructValue v2 = TraceFactory.eINSTANCE.createStructValue();
			v2.getValues().put("myKey", sv);
			v2.getValues().put("otherKey", sv2);
			
			s3.setValue(v2);
		}

		Assignment s4 = TraceFactory.eINSTANCE.createAssignment();
		{
			SimpleValue sv = TraceFactory.eINSTANCE.createSimpleValue();
			sv.setValue("xxx");
			StructValue v3 = TraceFactory.eINSTANCE.createStructValue();
			v3.getValues().put("innerStruct", sv);
			StructValue v2 = TraceFactory.eINSTANCE.createStructValue();
			v2.getValues().put("myKey", v3);
			s4.setValue(v2);
		}
		
		Trace t = TraceFactory.eINSTANCE.createTrace();
		t.getSteps().add(s);
		t.getSteps().add(s2);
		t.getSteps().add(s3);
		t.getSteps().add(s4);
		
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("demoPascal", new XMLResourceFactoryImpl());

		ResourceSet resSet = new ResourceSetImpl();

		URI uri = URI.createFileURI("/home/pascal/f.demoPascal");
		Resource resource = resSet.getResource(uri, true);
		resource.getContents().remove(0);
		resource.getContents().add(t);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
