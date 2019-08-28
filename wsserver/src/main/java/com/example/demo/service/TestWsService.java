package com.example.demo.service;

import javax.jws.WebService;

@WebService(name = "testWs", targetNamespace = "http://service.demo.example.com")
public interface TestWsService {
    String sayHello(String text);
}
