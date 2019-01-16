package com.wjk.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {
	
	/**
	 * 文章列表
	 * @return
	 */
	@RequestMapping("/news/newsList")
	public String newsList() {
		return "page/news/newsList";
	}
	
	/**
	 * 图片管理
	 * @return
	 */
	@RequestMapping("/img/images")
	public String images() {
		return "page/img/images";
	}
	
	/**
	 * 404页面
	 * @return
	 */
	@RequestMapping("/news/404")
	public String error404() {
		return "page/news/404";
	}
}
