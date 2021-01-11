package com.borje.warrior.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping("/index")
	public String index() {

		LOGGER.debug("这是debug");

		return "index";
	}

}
