package com.wjk.boot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @ClassName:  HelloWorldController   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: WangJKui
 * @date:   2019年1月16日 下午3:35:27   
 *     
 * @Copyright: 2019 www.WangJKui.com Inc. All rights reserved.
 */
@RestController
@RequestMapping("/hello")
public class HelloWorldController {


	@RequestMapping("/index")
	public String index() {
		return "Hello World";
	}
}
