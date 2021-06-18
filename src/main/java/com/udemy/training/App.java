package com.udemy.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Coach baseball = new BaseballCoach();
        // System.out.println(baseball.getDailyWorkout());
        // Coach track = new TrackCoach();
        // System.out.println(track.getDailyWorkout());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach myCoach = context.getBean("myCoach", Coach.class);

        System.out.println(myCoach.getDailyWorkout());

        context.close();

    }
}
