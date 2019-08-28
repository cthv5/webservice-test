package com.example.demo.service.impl;

import com.example.demo.service.TestWsService;

import javax.jws.WebService;

@WebService(name = "testWs", targetNamespace = "http://service.demo.example.com",
        endpointInterface = "com.example.demo.service.TestWsService")
public class TestWsServiceImpl implements TestWsService{
    @Override
    public String sayHello(String text) {
        System.out.println(">>>server:" + text);
        return "hello," + text;
    }
}
