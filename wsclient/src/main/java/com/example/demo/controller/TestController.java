package com.example.demo.controller;

import com.example.demo.service.TestWsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/test")
public class TestController {
    @Autowired
    private TestWsService testWsService;

    @GetMapping("test/{text}")
    public String testGet(@PathVariable("text") String text) {
        System.out.println(">>>client:" + text);
        return "success client";
    }

    @GetMapping("ws/{text}")
    public String testWs(@PathVariable("text") String text) {
        return testWsService.syHello(text);
    }
}
