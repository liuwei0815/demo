package com.quicky.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;


	@Test
	public void test() throws Exception {
//        // 保存字符串
//        stringRedisTemplate.opsForValue().set("aaa", "111");
//        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
//        System.out.println("获取值"+stringRedisTemplate.opsForValue().get("aaa"));
	}
}