package com.hyj.demo.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    @Value("${hyj}")
    private String hyj;

    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public String test(){
        System.out.println(hyj);
        return hyj;
    }
}
