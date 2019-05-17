package com.gl.springbootrestfulapi.controller;

import com.gl.springbootcommon.pojo.User;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 用户信息
 * @author: TL
 * @create: 2019-05-17 11:09
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public User getUser(){
        User user = new User();
        user.setId(10);
        user.setName("我在测试get不带id");
        user.setAge(10);
        return user;
    }

    /**
     * @PathVariable 是用来获得请求url中的动态参数的
     * @RequestParam 请求参数。顾名思义 就是获取参数的
     * @return
     */
    @GetMapping(value = "/{id}")
    public User getUser(@PathVariable("id") Integer id){
        System.out.println(id);
        User user = new User();
        user.setId(id);
        user.setName("我测试get带ID的情况");
        user.setAge(id);
        return user;
    }

    @PostMapping
    public User addUser(@RequestParam("name") String name, @RequestParam("age") Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setId(456456);
        return user;
    }

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable("id") Integer id){
        User user = new User();
        user.setName("我我测试删除用户");
        user.setAge(100);
        user.setId(id);
        return user;
    }

    @PutMapping("/{id}")
    public User upDateUser(@RequestParam("name") String name, @RequestParam("age") Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setId(6874984);
        return user;
    }

    @GetMapping("/age/{age}")
    public User getUserByAge(@PathVariable("age") Integer age){
        User user = new User();
        user.setName("我测试根据age获取用户信息");
        user.setAge(age);
        user.setId(48635);
        return user;
    }
}
