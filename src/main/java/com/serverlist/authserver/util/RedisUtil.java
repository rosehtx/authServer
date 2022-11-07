package com.serverlist.authserver.util;

import com.alibaba.fastjson.JSONObject;
import com.serverlist.authserver.config.RedisConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Set;

@Component
@Slf4j
public class RedisUtil {
    @Resource
    StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    public String getStringByKey(String key){
        return redisTemplate.opsForValue().get(key);
    }
    public void showKeys(){
        Set<String> all =  redisTemplate.keys("*");
        log.info(JSONObject.toJSON(all).toString());
    }
}
