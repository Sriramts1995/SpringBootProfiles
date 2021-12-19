package com.sree.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component("cpd")
public class CheckProfilesDev {

	@Value("${myval}")
	private String receivedvalString;
	public void printvals() {
		System.out.println(receivedvalString);	
	}
	@Bean
	@Profile({"dev"})
	public int calcSum()
	{
		int c=10+20;
		return c;
	}
	
	@Bean
	@Profile({"test"})
	public int calcMultiply() {
		int c=10*20;
		return c;
	}
}
