package com.holun.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EncodingController {

    @PostMapping("/display")
    public String display(@RequestParam("uname") String name, Model model) {

        model.addAttribute("name", name);
        return "display";
    }
}
