package com.wjk.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/layui")
public class LayUIController {
	
	@RequestMapping("/laycms")
	public String laycms() {
		return "index";
	}
}
