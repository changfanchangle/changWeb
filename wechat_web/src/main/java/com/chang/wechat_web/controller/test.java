package com.chang.wechat_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/test")
public class test {

    @ResponseBody
    @RequestMapping("/hello")
    public String show(){
        return "Hello World";
    }
}
