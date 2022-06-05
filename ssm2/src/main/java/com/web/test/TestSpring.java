package com.web.test;

import com.web.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: YunYu
 * \* Date: 2022/3/24
 * \* Time: 16:55
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
public class TestSpring {

    @Test
    public void run1(){
        //加载配置文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        //获取对象
        AccountService as = (AccountService)ac.getBean("accountService");
        //调用方法
        as.findAll();

    }
}
