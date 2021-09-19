package in2021winter.study.test;

import in2021winter.study.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HuangHai
 * @date 2021/2/24 21:30
 */
public class TestSsm {

    /**
     * 测试ssm整合中spring的正常使用是否OK
     */
    @Test
    public void testSpring(){
        ClassPathXmlApplicationContext springContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = springContext.getBean("userService", UserService.class);//将UserService.class改为IService.class就可以使用代理类了
        userService.findAll();
    }
}
