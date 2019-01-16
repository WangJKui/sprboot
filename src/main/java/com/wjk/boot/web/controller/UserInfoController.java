package com.wjk.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserInfoController {
	/**
	 * 登录页面
	 * @return
	 */
	@RequestMapping("/login")
	public String login() {
		return "page/login/login";
	}

	/**
	 * 个人资料
	 * @return
	 */
	@RequestMapping("/info")
	public String info() {
		return "page/user/userInfo";
	}
	/**
	 * 修改密码
	 * @return
	 */
	@RequestMapping("/changePwd")
	public String changePwd() {
		return "page/user/changePwd";
	}
	
	/**
	 * 后台首页
	 * @return
	 */
	@RequestMapping("/page/main")
	public String pageMain() {
		return "page/main";
	}
}
