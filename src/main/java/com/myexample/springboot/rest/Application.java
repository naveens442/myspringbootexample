package com.myexample.springboot.rest;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@EnableAutoConfiguration
@SpringBootApplication
public class Application  {
	//@SuppressWarnings("unused")
//	private static final Logger log = LoggerFactory.getLogger(Application.class);

  

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
		
}