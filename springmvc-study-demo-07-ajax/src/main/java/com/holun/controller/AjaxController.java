package com.holun.controller;

import com.holun.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AjaxController {

    @RequestMapping("/t1")
    public void t1(String name, HttpServletResponse response) throws IOException {
        if (name.equals("李豪伦"))
            response.getWriter().print("true");
        else
            response.getWriter().print("false");
    }

    @RequestMapping("/t2")
    @ResponseBody //在controller类中的某个方法上使用该注解,该方法会跳过视图解析,直接返回数据
    public List<User> t2() {
        List<User> list = new ArrayList<>();
        User user1  = new User(1, "李豪伦", "123");
        User user2  = new User(2, "豪伦", "1232");
        list.add(user1);
        list.add(user2);

        return list;
    }

    @RequestMapping("/t3")
    @ResponseBody
    public String t3(String uname) {
        String msg;
        if ("admin".equals(uname))
            msg = "ok";
        else
            msg = "error";

        return msg;
    }

    @RequestMapping("/t4")
    @ResponseBody
    public String t4(String upwd) {
        String msg;
        if ("123".equals(upwd))
            msg = "ok";
        else
            msg = "error";

        return msg;
    }


}
