package com.hmg.api.instagramserver.biz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String main(){
        return "Hi Instagram hello";
    }
    @GetMapping("/2")
    public String main2(){
        return "Hi Instagram hello 2";
    }

    @GetMapping("/3")
    public String main3(){
        return "Hi Instagram hello 3";
    }
}
