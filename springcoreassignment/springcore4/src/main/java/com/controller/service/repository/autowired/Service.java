package com.controller.service.repository.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service("Service")
public class Service {
    @Autowired
 DAO DAO;
 public Country createNewCountry() {
 
  return DAO.createNewCountry();
 }
 
}