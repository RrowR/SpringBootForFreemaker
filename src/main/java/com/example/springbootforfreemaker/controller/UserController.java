package com.example.springbootforfreemaker.controller;

import com.example.springbootforfreemaker.entiry.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: Rrow
 * @date: 2023/4/22 19:43
 * Description:
 */
@Controller
public class UserController {

    @GetMapping("/index")
    public String index(Model model) {
        User user = new User();
        user.setAge(11);
        user.setEmail("qq.com");
        user.setName("rrow");
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/redirect")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("index");
    }

    @GetMapping("/getData")
    @ResponseBody
    public String getData() {
        return "mydata";
    }

    @GetMapping("/page1")
    public String page1(HttpServletResponse response) throws IOException {
        return "page1";
    }

}
