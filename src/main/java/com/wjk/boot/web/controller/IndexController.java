package com.wjk.boot.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wjk.boot.web.vo.Menu;

/**
 * 
 * @ClassName:  IndexController   
 * @Description:首页 
 * @author: WangJKui
 * @date:   2019年1月17日 下午3:02:13   
 *
 */
@Controller
@RequestMapping("/index")
public class IndexController {

	private static Logger logger = LoggerFactory.getLogger(LoginController.class); 

	/**
	 * 
	 * @Title: index   
	 * @Description: 解决登录之后地址栏http://localhost:8181/spr/login/login ,
	 * 				未改变，可以刷新重新登录
	 *				 获取一级菜单
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@RequestMapping("/index")
	public String index(ModelMap map) {

		List<Menu> list = new ArrayList<>(); 

		Menu m1 = new Menu();
		m1.setId("1001");
		m1.setIcon("&#xe63c;");
		m1.setName("内容管理");
		m1.setTitle("内容管理");
		m1.setSort("1");
		m1.setType("contentManagement");

		Menu m11 = new Menu();
		m11.setId("1002");
		m11.setIcon("&#xe770;");
		m11.setName("用户中心");
		m11.setTitle("用户中心");
		m11.setSort("2");
		m11.setType("memberCenter");

		Menu m111 = new Menu();
		m111.setId("1003");
		m111.setIcon("&#xe620;");
		m111.setName("系统设置");
		m111.setTitle("系统设置");
		m111.setSort("3");
		m111.setType("systemeSttings");

		Menu m1111 = new Menu();
		m1111.setId("1004");
		m1111.setIcon("&#xe705;");
		m1111.setName("使用文档");
		m1111.setTitle("使用文档");
		m1111.setSort("4");
		m1111.setType("seraphApi");

		list.add(m1111);
		list.add(m111);
		list.add(m11);
		list.add(m1);

		map.put("list", list);

		logger.debug(map.toString());

		return "index";
	}


	/**
	 * 
	 * @Title: navs   
	 * @Description: 获取二级菜单  
	 * @param: @param map
	 * @param: @return      
	 * @return: String      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/navs")
	public List<Menu> navs(String type) {

		List<Menu> list = new ArrayList<>();
		switch (type) {
		case "contentManagement":

			list = contentManagement();

			break;
		case "memberCenter":

			list = memberCenter();

			break;
		case "systemeSttings":

			list = systemeSttings();

			break;
		case "seraphApi":

			list = seraphApi();

			break;
		default:
			break;
		}


		logger.debug(list.toString());

		return list;
	}

	private List<Menu> contentManagement() {
		List<Menu> l1 = new ArrayList<>(); 
		List<Menu> l2 = new ArrayList<>(); 

		Menu m1 = new Menu("2001","文章列表","contentManagement","1001","icon-text","文章列表","/page/news/newsList","1",false,null);

		Menu m2 = new Menu("2002","图片管理","contentManagement","1001","&#xe634;","图片管理","/page/img/images","2",false,null);

		Menu m4 = new Menu("2004","404页面","contentManagement","2003","&#xe61c;","404页面","/page/404","4",false,null);
		Menu m5 = new Menu("2005","500页面","contentManagement","2003","&#xe61c;","500页面","/page/500","4",false,null);
		Menu m6 = new Menu("2006","登录页面","contentManagement","2003","&#xe609;","登录页面","/user/login","6",false,null);
		l1.add(m4);
		l1.add(m5);
		l1.add(m6);

		Menu m3 = new Menu("2003","其他页面","contentManagement","1001","&#xe630;","其他页面","","3",false,l1);

		l2.add(m1);
		l2.add(m2);
		l2.add(m3);

		return l2;
	}

	private List<Menu> memberCenter() {
		//-----------------------------
		List<Menu> l3 = new ArrayList<>(); 

		Menu m7 = new Menu("3001","用户中心","memberCenter","1002","&#xe612;","用户中心","page/user/userList.html","1",false,null);
		Menu m8 = new Menu("3002","会员等级","memberCenter","1002","icon-vip","会员等级","page/user/userGrade.html","2",false,null);

		l3.add(m7);
		l3.add(m8);
		
		return l3;
	}
	private List<Menu> systemeSttings() {
		//--------------------------------
		Menu m9 = new Menu("4001","系统基本参数","systemeSttings","1003","&#xe631;","系统基本参数","page/systemSetting/basicParameter.html","1",false,null);
		Menu m10 = new Menu("4002","系统日志","systemeSttings","1003","icon-log","系统日志","page/systemSetting/logs.html","2",false,null);
		Menu m11 = new Menu("4003","友情链接","systemeSttings","1003","&#xe64c;","友情链接","page/systemSetting/linkList.html","3",false,null);
		Menu m12 = new Menu("4004","图标管理","systemeSttings","1003","&#xe857;","图标管理","page/systemSetting/icons.html","4",false,null);

		List<Menu> l4 = new ArrayList<>(); 
		l4.add(m9);
		l4.add(m10);
		l4.add(m11);
		l4.add(m12);
		return l4;
	}
	
	private List<Menu> seraphApi() {
		//--------------------------------------
		Menu m13 = new Menu("5001","三级联动模块","seraphApi","1004","icon-mokuai","三级联动模块","page/doc/addressDoc.html","1",false,null);
		Menu m14 = new Menu("5002","bodyTab模块","seraphApi","1004","icon-mokuai","bodyTab模块","page/doc/bodyTabDoc.html","2",false,null);
		Menu m15 = new Menu("5004","三级菜单","seraphApi","1004","icon-mokuai","三级菜单","page/doc/navDoc.html","3",false,null);
		List<Menu> l5 = new ArrayList<>(); 
		l5.add(m13);
		l5.add(m14);
		l5.add(m15);
		
		return l5;
	}
}
