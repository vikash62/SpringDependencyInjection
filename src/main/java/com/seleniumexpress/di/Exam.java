package com.seleniumexpress.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Exam {
 public static void main(String[] args) {
	 
	  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	  
	  Student stu = context.getBean("student",Student.class);
	  stu.displayStudentInfo();
	  
	  Student dilipN = context.getBean("dilip",Student.class);
	  dilipN.displayStudentInfo();
	  
	
  }
}
