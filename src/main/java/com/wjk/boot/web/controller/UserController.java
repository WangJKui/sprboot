package com.wjk.boot.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @ClassName:  UserController   
 * @Description:用户   
 * @author: WangJKui
 * @date:   2019年1月17日 上午10:36:16   
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private static Logger logger = LoggerFactory.getLogger(UserController.class); 

	/**
	 * 
	 * @Title info   
	 * @Description 个人资料 
	 * @return String      
	 */
	@RequestMapping("/info")
	public String info() {

		return "page/user/userInfo";
	}
	
	/**
	 * 
	 * @Title changePwd   
	 * @Description 修改密码  
	 * @return String      
	 */
	@RequestMapping("/changePwd")
	public String changePwd() {

		return "page/user/changePwd";
	}
	
	/**
	 * 
	 * @Title pageMain   
	 * @Description 后台首页 
	 * @return String      
	 */
	@RequestMapping("/page/main")
	public String pageMain() {

		return "page/main";
	}
}
