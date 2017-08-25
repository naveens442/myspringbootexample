package com.myexample.springboot.rest;

import org.bson.types.ObjectId;
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

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

//@EnableAutoConfiguration
@SpringBootApplication
public class Application  {
	//@SuppressWarnings("unused")
//	private static final Logger log = LoggerFactory.getLogger(Application.class);

  

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
		
}

/*
 BasicDBObject unwind=new BasicDBObject("$unwind", "$naveen");
		BasicDBObject sort=new BasicDBObject("$sort", new BasicDBObject("naveen.revision", 1));
		BasicDBObject project=new BasicDBObject("$project", new BasicDBObject("naveen", 1).append("test", 1));
		
		DBObject[] lst=new BasicDBObject[3];
		lst[0]=project;
		lst[1]=sort;
		lst[2]=unwind;
		
		Iterable<DBObject> output=collection.aggregate(new BasicDBObject("$match", new BasicDBObject("_id", new ObjectId("59a0295a56c9b3490903e8fe"))),lst).results();
		for (DBObject dbObject : output)
		{
		    System.out.println(dbObject);
		}
*/
