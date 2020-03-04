package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String configLoc = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
		MyCalculator mycalCalculator = ctx.getBean("myCalculator", MyCalculator.class);
		
		mycalCalculator.add();
		mycalCalculator.sub();
		mycalCalculator.mul();
		mycalCalculator.div();
		

	}

}
