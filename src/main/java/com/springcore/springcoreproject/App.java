package com.springcore.springcoreproject;

import java.applet.AppletContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Sakib, Details are as below!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        StudentBean bean = (StudentBean) context.getBean("Student1");
        System.out.println(bean);
    }
}
