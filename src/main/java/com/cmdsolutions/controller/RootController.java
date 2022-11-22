package com.cmdsolutions.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * Example rest controller with simple status
 * 
 * @author davidmercieca
 *
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class RootController {

protected final  Logger LOGGER = LoggerFactory.getLogger(RootController.class);

	@RequestMapping("/status")
	public String getStatus() {
	    return "Cuscal SpringBoot POC is online...";
	}
	
}
