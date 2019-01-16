package com.wjk.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	/**
	 * 登录
	 * @return
	 */
	@RequestMapping("/login")
	public String login() {
		return "";
	}
	
	/**
	 * 登出
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout() {
		return "";
	}
}
