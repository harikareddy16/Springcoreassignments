package com.dbConfig.SpringCore6;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


	public class Application
		{
		public static void main( String[] args ) throws SQLException
		{
    	
	    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("com.dbConfig.SpringCore6");
			context.refresh();
			System.out.println("Refreshing the spring context");
			Connections Connection = context.getBean(Connections.class);
	
			Connections.printDBConfigs();
			
			// close the spring context
			context.close();
	}
       // System.out.println( "Hello World!" );
}
