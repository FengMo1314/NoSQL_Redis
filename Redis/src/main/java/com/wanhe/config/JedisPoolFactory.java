package com.wanhe.config;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Description：
 * @author：13937
 * @Date：2022/11/2
 **/
public class JedisPoolFactory {
    //声明连接池对象，静态
    private static final JedisPool jedisPool;
    static {
        JedisPoolConfig config=new JedisPoolConfig();
        //最大连接数
        config.setMaxTotal(8);
        //最大空闲连接
        config.setMaxIdle(8);
        //超时时间
        config.setMaxWaitMillis(1000);
        //最小空闲连接
        config.setMinIdle(0);

        jedisPool=new JedisPool(config,"192.168.88.134",6379,3000,"123456");
    }
    public static Jedis getJedis(){
        //获取到jedis对象
        return jedisPool.getResource();
    }

}
