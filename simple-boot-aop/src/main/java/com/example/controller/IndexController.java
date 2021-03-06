package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@RequestMapping("/index")
	@ResponseBody
	public String index() {
		logger.info("IndexController index.. content");
		return "hello world";
	}

}
