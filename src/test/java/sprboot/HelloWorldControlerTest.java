package sprboot;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.wjk.boot.SpringbootApplication;

@RunWith(SpringRunner.class)
//,注入TestRestTemplate使用 webEnvironment=WebEnvironment.RANDOM_PORT
@SpringBootTest(classes = SpringbootApplication.class,webEnvironment=WebEnvironment.RANDOM_PORT)
public class HelloWorldControlerTest {
	
	@Autowired
    private TestRestTemplate testRestTemplate;
	
	@BeforeClass
    public static void beforeClassTest(){
        System.out.println("BeforeClass 类加载时运行...");
    }

    @AfterClass
    public static void afterClassTest(){
        System.out.println("AfterClass 类加载结束时运行...");
    }

    @Before
    public void before(){
        System.out.println("Before 测试方法开始之前执行...");
    }

    @After
    public void after(){
        System.out.println("After 测试方法执行之后执行...");
    }

    @Test
    public void testMethod(){
        System.out.println("Test 测试方法...");
    }
    
    @Test
    public void testMethodHello(){
    	//接口
        String result = testRestTemplate.getForObject("/hello/index",String.class);
        System.out.println("HelloWorldController===="+result);

    }

}
