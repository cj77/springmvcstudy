package com.springdemo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	private static final Logger log = Logger.getLogger(TestController.class.getName());
	@RequestMapping("/demo")
    public String index(){
		log.debug("request mapping /demo");
        return "demo";
    }
}
