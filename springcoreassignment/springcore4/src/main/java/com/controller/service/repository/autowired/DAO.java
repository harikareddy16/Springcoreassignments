package com.controller.service.repository.autowired;

import org.springframework.stereotype.Repository;
 
@Repository("DAO")
public class DAO {
 
 public Country createNewCountry() {
  // You should get it from database
  Country country = new Country("india", 7809654);
  return country;
 }
 
}