package com.wjk.boot.web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wjk.boot.web.vo.User;

/**
 * 
 * @ClassName:  LoginController
 * @Description:登录Controller
 * @author: WangJKui
 * @date:   2019年1月17日 上午9:25:57
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	private static Logger logger = LoggerFactory.getLogger(LoginController.class); 

	/**
	 * @Title tologinPage   
	 * @Description 登录页  
	 * @return String      
	 */
	@RequestMapping("/tologin")
	public String tologinPage() {
		return "page/login/login";
	}


	/**
	 * @Title login   
	 * @Description 登录操作 
	 * @return String      
	 */
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login(User user,String code) {

		logger.debug("登录操作:用户名="+user.getUserName()+",密码="+user.getPassword()+",验证码="+code);;

		Subject subject = SecurityUtils.getSubject();
		// 此处的密码应该是按照后台的加密规则加密过的，不应该传输明文密码
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(),user.getPassword());

		try {
			subject.login(token);
		} catch (UnknownAccountException e) {
			logger.error("用户名或密码错误");
			e.printStackTrace();
		} catch (IncorrectCredentialsException e) {
			logger.error("用户名或密码错误");
			e.printStackTrace();
		} catch (AuthenticationException e) {
			//其他错误，比如锁定，如果想单独处理请单独catch处理
			logger.error("其他错误");
			e.printStackTrace();
		}
		return "redirect:/index/index";
	}

	
	/**
	 * 
	 * @Title logout   
	 * @Description 登出
	 * @return String      
	 */
	@RequestMapping("/logout")
	public String logout() {
		
		Subject subject = SecurityUtils.getSubject();
		
		subject.logout();
		
		return "page/login/login";
	}
}
