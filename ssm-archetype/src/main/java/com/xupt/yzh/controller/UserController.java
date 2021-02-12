package com.xupt.yzh.controller;

import com.xupt.yzh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index.html")
    public String index() {
        return "index";
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public String exist(@PathVariable("id") long uid) {
        String msg;
        if (userService.exist(uid)) {
            msg = "数据库中已有uid=" + uid + "的用户";
        } else {
            msg = "数据库中没有uid=" + uid + "的用户";
        }
        return msg;
    }
}
