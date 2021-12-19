package com.sree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sree.beans.CheckProfilesDev;

@SpringBootApplication
public class SpringBootProfilesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootProfilesApplication.class, args);
		
		CheckProfilesDev cpDev=ctx.getBean("cpd",CheckProfilesDev.class);
		
		int myval=cpDev.calcSum();
		int myvalmul=cpDev.calcMultiply();
		cpDev.printvals();
		System.out.println("Sum is:"+myval);
		System.out.println("Mutlipication is :"+myvalmul);
	}

}
