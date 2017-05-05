package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhg-pc on 17/5/5.
 */
@Controller

@RequestMapping(value = "/index")
public class IndexController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(ModelMap map){
        map.addAttribute("title","首页");
        String url = "register";
        map.addAttribute("register",url);
        return "index/index";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(ModelMap map){
        map.addAttribute("title","注册");
        return "index/register";
    }
}
