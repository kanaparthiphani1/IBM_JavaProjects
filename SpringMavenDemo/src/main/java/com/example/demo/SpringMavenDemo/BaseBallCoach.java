package com.example.demo.SpringMavenDemo;
import lombok.Setter;

@Setter
public class BaseBallCoach implements Coach {

	private FortuneService fortuneService;

	public String getDailyWorkout() {
		return "practice backvolley today.!";
	}

	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
}