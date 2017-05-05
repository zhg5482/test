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
        String register_url  = "register";
        String forgetPwd_url = "forgetPwd";
        map.addAttribute("register",register_url);
        map.addAttribute("forgetPwd",forgetPwd_url);
        return "index/index";
    }

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(ModelMap map){
        map.addAttribute("title","注册用户");
        return "index/register";
    }

    @RequestMapping(value = "/forgetPwd",method = RequestMethod.GET)
    public String forgetPwd(ModelMap map){
        map.addAttribute("title","忘记密码");
        return "index/forgetPwd";
    }
}
