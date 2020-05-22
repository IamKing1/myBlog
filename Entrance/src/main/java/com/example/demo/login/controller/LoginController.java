package com.example.demo.login.controller;


import com.example.demo.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginJumpController
 * @Description TODO
 * @Author admin
 * @Date 2020/1/19 10:41
 * @Version 1.0
 **/
@RestController
public class LoginController {



    @Autowired
    private LoginService loginService;

    /**
     *
     * @param name
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return loginService.getLoginMeg(name);
    }
}
