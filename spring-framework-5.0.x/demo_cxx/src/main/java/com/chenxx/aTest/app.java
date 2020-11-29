package com.chenxx.aTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
	public static void main(String[] args) {

		System.out.println("HELLO");

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

		annotationConfigApplicationContext.register(Appconfig.class);
	//	annotationConfigApplicationContext.register(com.chenxx1.imports.MyImportSelector1.class);
		annotationConfigApplicationContext.refresh();
		annotationConfigApplicationContext.getBean("x");

//		annotationConfigApplicationContext.getBean("com.chenxx1.imports.ImportDao1");

//		X x = (X) context.getBean("x");
//		x.sayHi();
//
//
//		System.out.println("HELLO2");
//
//		System.out.println(context.containsBean("Appconfig.class"));
//		System.out.println("HELLO3");

	}


}



