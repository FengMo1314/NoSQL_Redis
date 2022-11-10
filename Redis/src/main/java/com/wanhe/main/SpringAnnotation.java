package com.wanhe.main;

import com.wanhe.config.SpringConfig;
import com.wanhe.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import redis.clients.jedis.Jedis;

/**
 * @Description：
 * @author：13937
 * @Date：2022/11/2
 **/
public class SpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Jedis jedis = context.getBean(Jedis.class);
        System.out.println(jedis);

    }
}
