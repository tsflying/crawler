package com.mff.weibo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    private static Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(String name){
        return "hello:"+name;
    }
}
