package com.feign.demo;

import com.feign.demo.web.controller.MyField;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
import java.util.Calendar;
import java.util.Date;

@SpringBootTest
class DemoApplicationTests {

    @MyField(length = 2)
    private int  ages;


    @Test
    public void testMyField(){

        // 获取类模板
        Class c = DemoApplicationTests.class;

        // 获取所有字段
        for(Field f : c.getDeclaredFields()){
            // 判断这个字段是否有MyField注解
            if(f.isAnnotationPresent(MyField.class)){
                MyField annotation = f.getAnnotation(MyField.class);
                System.out.println(  "长度:[" + annotation.length() +"]");
            }
        }

    }
    @Test
    public void test() {
        Date now = new Date();
        Date dayDate = DateUtils.setDays(now,30);
        Integer i = DateUtils.truncatedCompareTo(dayDate, now, Calendar.SECOND);
        System.out.println("now"+now);
        System.out.println("30天后"+dayDate);
        System.out.println(i);
    }
}
