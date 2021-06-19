package com.udemy.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Coach baseball = new BaseballCoach();
        // System.out.println(baseball.getDailyWorkout());
        // Coach track = new TrackCoach();
        // System.out.println(track.getDailyWorkout());

        // ClassPathXmlApplicationContext context = new
        // ClassPathXmlApplicationContext("applicationContext.xml");

        // Coach myCoach = context.getBean("myCoach", Coach.class);

        // System.out.println(myCoach.getDailyWorkout());

        // System.out.println(myCoach.getDailyFortune());

        // context.close();

        // setter injection

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach myCoach = context.getBean("myCoach2", CricketCoach.class); // bsa coach , bsa cricketcoach

        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getDailyFortune());

        System.out.println(myCoach.getEmailAddress());

        System.out.println(myCoach.getTeam());

        context.close();

        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext2.xml");
    
        Coach daCoach = context2.getBean("myCoach", Coach.class);

        Coach aplCoach = context2.getBean("myCoach", Coach.class);
    }
}
