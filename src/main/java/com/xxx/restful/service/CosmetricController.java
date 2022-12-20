package com.xxx.restful.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.log.Logging;
import com.xxx.dto.Cosmetic;

@RestController
public class CosmetricController {

	List<Cosmetic> cosmetics = new ArrayList<Cosmetic>(Arrays.asList(
			new Cosmetic("LIP001", "XOXO Lipstick", 1),
			new Cosmetic("BRO001", "NYX Brush On Palette", 1)
			));

	final private Logging log = new Logging(CosmetricController.class.toString());
	
	@GetMapping("/cosmetics")
	public List<Cosmetic> getAllCosmetics() {
		
		log.debug("Debugging log");
		log.info("Info log");
		log.warn("Hey, This is a warning!");
		log.error("Oops! We have an Error. OK");
		log.fatal("Damn! Fatal error. Please fix me.");
		System.out.println("sys out");
		System.err.println("sys error");
		
		return cosmetics;
	}
	
}
