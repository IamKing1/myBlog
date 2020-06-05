package com.example.demo.vueTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName vueTestController
 * @Description TODO
 * @Author admin
 * @Date 2020/6/2 9:37
 * @Version 1.0
 **/
@Controller
public class VueTestController {

    @RequestMapping("test")
    public String openVueTestJump(){
        System.out.println("跳转");
        return "view/vueTest2.html";
    }
}
