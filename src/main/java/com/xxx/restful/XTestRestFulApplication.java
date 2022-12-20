package com.xxx.restful;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XTestRestFulApplication{

	private static final Logger LOGGER = LogManager.getLogger(XTestRestFulApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(XTestRestFulApplication.class, args);
		LOGGER.debug("Debugging log");
		LOGGER.info("Info log");
		LOGGER.warn("Hey, This is a warning!");
		LOGGER.error("Oops! We have an Error. OK");
		LOGGER.fatal("Damn! Fatal error. Please fix me.");
	}
	
}
