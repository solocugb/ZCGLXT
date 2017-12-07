package com.haina.zcglxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ZcglxtStart extends SpringBootServletInitializer{
	public static void main(String[] args) {		
		//springboot入口运行类
		SpringApplication.run(ZcglxtStart.class, args);
	}
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(ZcglxtStart.class);
	    }

}
