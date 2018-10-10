package com.seven.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author LiDuo
 * @vreate 2018/9/28
 **/

@RestController
public class Hello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)     // 浏览器输入 http://localhost:8088/hello
    public String say(){
        return this.getCurrentTime();
    }

    public String getCurrentTime(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());// new Date()为获取当前系统时间
    }



}
