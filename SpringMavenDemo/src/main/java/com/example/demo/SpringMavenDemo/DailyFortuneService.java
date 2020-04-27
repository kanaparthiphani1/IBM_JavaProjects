package com.example.demo.SpringMavenDemo;


import java.util.Formattable;
import java.util.Formatter;


public class DailyFortuneService implements FortuneService, Formattable {

	public void formatTo(Formatter formatter, int flags, int width, int precision) {
		
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return "today is yourlucky day.";

	}

	
}
