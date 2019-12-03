package chethan.prabhu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringStarter {

	public static void main(String[] args) {
		
		//Creating the spring container
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrive the beans from spring container
		Coach coach = applicationContext.getBean("cricketCoach", Coach.class); //without 2nd parameter the type will be object
		CricketCoach cricketCoach = applicationContext.getBean("cricketCoach", CricketCoach.class);
		//performing necessary operations with the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getCouponCode());
		System.out.println(cricketCoach.getDetails());
		
		if(coach == cricketCoach) {
			System.out.println("Both the objects are same");
			System.out.println(coach);
			System.out.println(cricketCoach);
		} else {
			System.out.println("Both the objects are not same");
			System.out.println(coach);
			System.out.println(cricketCoach);
		}
		
		//closing the spring container
		applicationContext.close();

	}

}
