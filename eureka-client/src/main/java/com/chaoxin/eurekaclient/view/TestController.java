package com.chaoxin.eurekaclient.view;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/hello")
    public void sayGetHello(){
        System.out.println("192.168.1.58:8762");
    }
    @PostMapping("/hello")
    public String sayPostHello(){
        return "192.168.1.58:8762";
    }
}
