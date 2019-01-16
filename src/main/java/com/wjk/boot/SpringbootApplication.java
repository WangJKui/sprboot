package com.wjk.boot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*@ComponentScan("com.wjk.boot")
@EnableAutoConfiguration*/

/**
 * @SpringBootApplication
 * 该注解指定项目为springboot，由此类当作程序入口
         自动装配 web 依赖的环境
         添加 @EnableCaching 注解，开启缓存功能。
 * @author h
 *
 */

@SpringBootApplication
public class SpringbootApplication {


	/**
	 * application-dev.properties：用于开发环境
		application-test.properties：用于测试环境
		application-prod.properties：用于生产环境
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}