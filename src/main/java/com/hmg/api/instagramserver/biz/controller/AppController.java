package com.hmg.api.instagramserver.biz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/")
    public String main(){
        return "Hi Instagram hello";
    }
}
