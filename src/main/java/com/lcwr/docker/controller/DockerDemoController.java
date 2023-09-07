package com.lcwr.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerDemoController {

    @GetMapping("/testApi")
    public String testMethod(){
        return "it is working fine..";
    }
}
