package com.myexample.springboot.rest.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myexample.springboot.rest.modal.Bean;

@RestController
@RequestMapping(value="/rest/student")
class StudentService{
 
   @RequestMapping(value="/",method = RequestMethod.GET)
   public String getAllStudents(){
      return "Naveen Sharma";
   }
   
   @RequestMapping(value="/add",method = RequestMethod.POST)
   public Bean postAllStudents(@RequestBody Bean bean){
      return bean;
   }
   
   @RequestMapping(value="/sub",method = RequestMethod.POST)
   public Bean testAllStudents(@RequestBody Bean bean){
      return bean;
   }
   
}