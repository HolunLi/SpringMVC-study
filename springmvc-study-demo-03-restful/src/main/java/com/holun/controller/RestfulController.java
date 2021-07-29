package com.holun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * restful风格的优点：简洁、高效、相对安全
 */

@Controller
public class RestfulController {

    @RequestMapping(value = "/test/{a}/{b}", method = RequestMethod.GET) //等价于 @GetMapping(value = "/test/{a}/{b}")
    public String test(@PathVariable int a, @PathVariable int b, Model model) {
        int result = a + b;

        model.addAttribute("result", result);

        return "test";
    }

    @PostMapping("/test2") //等价于@RequestMapping(value = "/test2", method = RequestMethod.POST)
    public String test2(String a, String b, Model model) {

        int i1 = Integer.parseInt(a);
        int i2 = Integer.parseInt(b);

        model.addAttribute("result", i1+i2);

        return "test";
    }
}
