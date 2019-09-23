package com.alex.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class Demo2Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		//SpringApplication.run(Demo2Application.class, args);
		new Demo2Application()
        .configure(new SpringApplicationBuilder(Demo2Application.class))
        .run(args);
	}

}
