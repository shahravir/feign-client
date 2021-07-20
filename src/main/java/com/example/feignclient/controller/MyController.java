package com.example.feignclient.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "feign-service-v0")
public interface MyController {

    @GetMapping("/hello")
    public String hello();
}
