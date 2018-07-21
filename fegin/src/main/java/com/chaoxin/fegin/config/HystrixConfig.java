package com.chaoxin.fegin.config;

import com.chaoxin.fegin.mapper.FeignMapper;
import org.springframework.context.annotation.Configuration;

/**
 * @author fly
 * 必须实现ClientFeign接口,
 * 不建议在回调函数内部写复杂业务逻辑,
 * 直接快速返回字符串,避免线程阻塞
 */
@Configuration
public class HystrixConfig implements FeignMapper {
    @Override
    public String getString(String name) {
        return "errordsf";
    }
}