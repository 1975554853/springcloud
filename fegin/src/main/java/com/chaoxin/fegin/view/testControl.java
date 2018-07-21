package com.chaoxin.fegin.view;

import com.chaoxin.fegin.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo")
@RestController
public class testControl {
    @Autowired
    FeignService feignService;
    @GetMapping("/get")
    public String get(){
        return feignService.getString();
    }
    @GetMapping("/get1")
    public String get1(){
        return "123";
    }
}
