package com.controller.service.repository.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
 
@Controller ("Controller")
public class Controller 
{
     @Autowired
    Service Service;
 
    public Country createNewCountry()
    {
        return Service.createNewCountry();
    }
}