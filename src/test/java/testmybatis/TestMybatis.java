/*
* Copyright (c) 2016 Huangpf. All Rights Reserved.
*/
package testmybatis;

import com.alibaba.fastjson.JSON;
import com.huangpf.po.UserT;
import com.huangpf.service.IUserService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

/**
 * TODO 类的描述
 *
 * @author: Huangpf  Date: 2016/6/21 Time: 15:56.
 */
public class TestMybatis {
    private static Logger logger = Logger.getLogger(TestMybatis.class);
    //  private ApplicationContext ac = null;
    @Resource
    private IUserService userService = null;

//  @Before
//  public void before() {
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//      userService = (IUserService) ac.getBean("userService");
//  }

    @Test
    public void test1() {
        UserT user = userService.getUserById(1);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        logger.info("huanghuang" + JSON.toJSONString(user));
    }
}
