package com.wanhe.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * @Description：
 * @author：13937
 * @Date：2022/11/2
 **/
public class SpringWithJedis {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("Spring.xml");
        Jedis jedis = context.getBean("jedis", Jedis.class);
        jedis.auth("123456");
        jedis.set("birth","2002-9-20");
        String birth = jedis.get("birth");
        System.out.println("birth : "+birth);
    }
}
