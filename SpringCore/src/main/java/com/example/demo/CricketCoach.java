package com.example.demo;

import lombok.Setter;

@Setter
public class CricketCoach implements Coach {

	private Fortune objFortune;
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "CoverDrive";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return objFortune.getFortune();
	}

}
