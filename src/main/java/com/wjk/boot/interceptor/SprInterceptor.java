package com.wjk.boot.interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class SprInterceptor implements HandlerInterceptor{
	
    private static Logger logger = LoggerFactory.getLogger(SprInterceptor.class); 

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		logger.debug(((HandlerMethod)handler).getBean().getClass().getName());
		
		request.setAttribute("startTime", System.currentTimeMillis());
		
		logger.debug("getRequestURL："+request.getRequestURL());
		logger.debug("getServerName："+request.getServerName());
		logger.debug("getServerPort："+request.getServerPort());
		logger.debug("getContextPath："+request.getContextPath());
		logger.debug("getServletPath："+request.getServletPath());
		logger.debug("getQueryString："+request.getQueryString());

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {

		Long start = (Long) request.getAttribute("startTime");
		logger.debug("耗时:"+(System.currentTimeMillis() - start));
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception)
			throws Exception {

		Long start = (Long) request.getAttribute("startTime");
		logger.debug("耗时:"+(System.currentTimeMillis() - start));

	}
}
