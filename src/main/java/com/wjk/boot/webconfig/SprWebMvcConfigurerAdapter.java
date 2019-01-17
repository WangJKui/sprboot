package com.wjk.boot.webconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.wjk.boot.interceptor.SprInterceptor;


@Configuration
public class SprWebMvcConfigurerAdapter implements WebMvcConfigurer{

	@Autowired
	private SprInterceptor sprInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 可添加多个
		registry.addInterceptor(sprInterceptor).excludePathPatterns("/static/**");
	}

	 /**
	  * 添加静态资源文件，外部可以直接访问地址
	  * <p>Title: addResourceHandlers</p>   
	  * <p>Description: </p>   
	  * @param registry   
	  */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        //需要配置1：----------- 需要告知系统，这是要被当成静态文件的！
        //第一个方法设置访问路径前缀，第二个方法设置资源路径
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
	
    /**
     * 开启路径后缀匹配
     * <p>Title: configurePathMatch</p>   
     * <p>Description: </p>   
     * @param configurer   
     */
   /* @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.setUseRegisteredSuffixPatternMatch(true);
    }*/
    
}
