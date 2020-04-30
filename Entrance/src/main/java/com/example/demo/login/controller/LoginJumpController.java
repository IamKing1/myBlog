package com.example.demo.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName LoginJumpController
 * @Description TODO
 * @Author admin
 * @Date 2020/1/19 10:41
 * @Version 1.0
 **/
@Controller
public class LoginJumpController {

    /**
     * 跳转登录页面
     * @return
     */
    @RequestMapping("login")
    public  String openLoginJump(){
        System.out.println("跳转登陆页面！");
        return "login.html";
    }

}
