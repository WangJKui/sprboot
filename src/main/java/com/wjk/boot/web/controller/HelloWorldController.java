package com.wjk.boot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {


	@RequestMapping("/index")
	public String index() {
		return "Hello World";
	}
}
