package com.holun.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 在没有配置视图解析器的情况下，可以通过重定向和请求转发的形式跳转到指定的页面
 */

@Controller
public class NoViewResolverController {

    @RequestMapping("/test1")  //不建议这样使用（这样的方式就等同于使用servlet）
    public void test1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        /*
        request.setAttribute("msg", "hello");
        request.getRequestDispatcher("test.jsp").forward(request, response); //请求转发
        */
        request.getSession().setAttribute("msg", "hello");
        response.sendRedirect("test.jsp");  //重定向
    }

    @RequestMapping("/test2")
    public String test2(Model model) {
        model.addAttribute("msg", "hello");

        return "forward:test.jsp";  //直接 return "test.jsp", 默认就是请求转发
        //return "forward:/WEB-INF/jsp/test2.jsp";  请求转发可以访问到WEB-INF下的资源
    }

    @RequestMapping("/test3")
    public String test3(HttpServletRequest request) {

        request.getSession().setAttribute("msg", "hello");

        return "redirect:test.jsp";  //重定向（注意:重定向不能访问WEB-INF下的资源)
    }

}
