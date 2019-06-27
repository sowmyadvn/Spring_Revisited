package com.love2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	public static void main(String[] args) {
		//Create spring bean
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Configure spring IoC container
		TheCoach coach = context.getBean("myCoach", TheCoach.class);
		//Retrieve beans from container 
		System.out.println(coach.getDailyWorkout());
		//Perform operation and close
		context.close();
	}
}
