package com.Autowiring.Autowiring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;  


public class Application 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("applicationContext.xml");  
        BankAccountController obj=(BankAccountController)applicationcontext.getBean("obj");  
        obj.withdraw();     
        }
}
