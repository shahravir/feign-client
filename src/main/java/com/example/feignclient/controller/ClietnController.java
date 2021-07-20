package com.example.feignclient.controller;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ClietnController {

    @Autowired
    MyController myController;

    @GetMapping("hello-client")
    public String helloClient(){
        return "hello-client" + myController.hello();
    }
}
