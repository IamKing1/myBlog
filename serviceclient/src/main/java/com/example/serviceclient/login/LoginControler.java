package com.example.serviceclient.login;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControler {


    @Value("${server.port}")
    String port;
    @RequestMapping(value = "/hei")
    public String home(@RequestParam String name) {
        System.out.println("---------------------------------------");
        return "hei "+name+",i am from port:" +port;
    }
}
