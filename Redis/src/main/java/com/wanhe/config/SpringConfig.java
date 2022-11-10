package com.wanhe.config;

/**
 * @Description：
 * @author：13937
 * @Date：2022/11/2
 **/
@Configuration
@ComponentScan({"com.wanhe.service"})
public class SpringConfig {

        @Bean
        public Jedis getJedis(){
            return new Jedis("192.168.88.134",6379,3000);
        }


}
