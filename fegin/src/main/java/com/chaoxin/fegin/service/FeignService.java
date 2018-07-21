package com.chaoxin.fegin.service;

import com.chaoxin.fegin.mapper.FeignMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeignService {
    @Autowired
    FeignMapper feignMapper;
    public String getString() {
        return feignMapper.getString("刘帅");

    }
}
