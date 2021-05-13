package com.controller.service.repository.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class ApplicationMain {
 public static void main(String[] args) {
 
  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
  Controller controller = (Controller) context.getBean("Controller");
  Country country = controller.createNewCountry();
  System.out.println("Country Name : " + country.getCountryName());
  System.out.println("Country's Population : " + country.getPopulation());
 }
}