package org.jacoco.examples.maven.groovy

class HelloWorld {

	String getMessage(Boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

}
