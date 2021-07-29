package com.holun.controller;


import com.holun.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 接收从前端传过来的请求参数
 */

@Controller
public class UserController {

    //接收前端传度传过来的请求参数，采用此方法，请求参数名必须和方法中的参数名一致
    @GetMapping("/test1")
    public String test1(String name, String pwd, Model model) {

        model.addAttribute("name", name);
        model.addAttribute("pwd", pwd);

        return "result1";
    }

    //使用@RequestParam注解,将请求参数名写死，即前端过来的请求参数名必须和该注解指定参数名一致，否则页面报400（建议使用）
    @GetMapping("/test3")
    public String test3(@RequestParam("username") String name, @RequestParam("password") String pwd, Model model) {

        model.addAttribute("name", name);
        model.addAttribute("pwd", pwd);

        return "result1";
    }

    //接收前端传度传过来的请求参数，采用此方法，请求参数名必须和bean的属性名匹配
    @GetMapping("/test2")
    public String test2(User user, Model model) {
        model.addAttribute("user", user);
        return "result2";
    }

}
