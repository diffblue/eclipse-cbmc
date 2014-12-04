CBMC plug-in for Eclipse
============
CBMC is a Bounded Model Checker for C and C++ programs (http://www.cprover.org/cbmc/).
This plug-in provides an integration of CBMC with Eclipse CDT.
The main features of this plug-in are:
- A CBMC view presenting the properties to verify and their status
- Integration with the Eclipse debugger to navigate a counter example
- A launch configuration to persist CBMC configuration 
- Support for cbmc and goto-instrument

How to install
--------------
A binary version of this plug-in is available at http://dl.bintray.com/prapicault/Eclipse-cbmc/

Contributing
------------
Bug reports, enhancement requets or just sheer appreciation should all be done through the github issue tracking.
Likewise, code contributions should be done through pull requests.

How to build
------------
The build is done using Maven (http://maven.apache.org/download.cgi).
- Clone the git repo
- Run __mvn clean verify__ at the root of the cloned repo

License
-------
This software is licensed under the EPL license (https://www.eclipse.org/legal/epl-v10.html).
