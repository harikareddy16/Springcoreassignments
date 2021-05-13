package com.config.bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
 
@Configuration
public class Application {
 
    @Bean(name="demoService")
    public DemoManager helloWorld() 
    {
        return new DemoManagerImpl();
    }
}