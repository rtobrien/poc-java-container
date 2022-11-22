package com.cmdsolutions.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan (basePackages=("com.cmdsolutions"))

public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {

	private final  Logger LOGGER = LoggerFactory.getLogger(ApplicationRunner.class);
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		LOGGER.debug("Spring App Runner Initialised..");
	}
	
	public static void main(String[] args) {
	    SpringApplication.run(ApplicationRunner.class, args);
	}

}
