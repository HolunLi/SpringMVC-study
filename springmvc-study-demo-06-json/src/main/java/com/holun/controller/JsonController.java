package com.holun.controller;


import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.holun.entity.User;
import com.holun.utils.JsonUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * json（javascript object Notation）, 即javascript对象标记
 * json是纯文本的数据格式，简单讲json文本就是一个符合json格式的字符串。
 * json用于前端和后端之间的数据交换
 */

@RestController //在Controller类上使用该注解，类中的方法可以跳过视图解析器,直接返回一个字符串到前端页面显示
public class JsonController {

    @RequestMapping("/test1")
    public String test1() {
       /*
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User(1, "李浩伦", "1234");
        String jStr = objectMapper.writeValueAsString(user); //将java对象转换成json字符串
       */

        //使用fastjson
        return JSON.toJSONString(new User(1, "李浩伦", "1234"));
    }

    @RequestMapping("/test2")
    public String test2() {
        //ObjectMapper objectMapper = new ObjectMapper();
        User user1 = new User(1, "李浩伦", "1234");
        User user2 = new User(2, "独一味", "134");
        User user3 = new User(3, "老张", "122");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

       /*
        String jStr = objectMapper.writeValueAsString(list);  //将list集合转换成json字符串
        */

        return JsonUtil.getJsonString(list);
    }

    @RequestMapping("/test3")
    public String test3() {

        //将Date对象转换成json字符串
        return JsonUtil.getJsonString(new Date());
    }

}
