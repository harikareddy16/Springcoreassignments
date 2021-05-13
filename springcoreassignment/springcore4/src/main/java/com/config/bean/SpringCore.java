package com.config.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 

 
public class SpringCore
{
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
 
        Manager  obj = (Manager) context.getBean("Service");
 
        System.out.println( obj.getServiceName() );
    }
}