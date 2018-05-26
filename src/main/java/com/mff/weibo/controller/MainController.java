package com.mff.weibo.controller;

import com.mff.weibo.model.User;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    private static Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(value ="/", method = RequestMethod.GET)
    String home(Model model, User user) {
        model.addAttribute("user", user);
        return "index";
    }

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(String name){
        return "hello:"+name;
    }
}
