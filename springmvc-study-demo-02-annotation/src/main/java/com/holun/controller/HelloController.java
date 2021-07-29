package com.holun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/HelloController") //在类上再加上这个注解，访问路径为：http://localhost:8888/springmvc_study_demo_02/HelloController/hello
                                      //如果类上不加这个注解，访问路径为：http://localhost:8888/springmvc_study_demo_02/hello
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {

        model.addAttribute("msg", "hello lihaolun!");

        return "hello";
    }
}
