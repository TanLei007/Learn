package com.gl.springbootapi.controller;

import com.gl.springbootutils.utils.DateUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 测试web
 * @author: TL
 * @create: 2019-05-17 10:31
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/date")
    public String getDate(){
        return DateUtils.getCurDate().toString();
    }
}
