package com.tomorrowcat.userapp.controller;

import com.tomorrowcat.userServiceApi.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired   //用autowired也可以正常使用
    private UserService userService;

//    @Reference
//    private UserService userService;


    /**
     * @description:  通过id查用户
     * @param: id
     * @return: Object
     */
    @RequestMapping("/getUser")
    public Object testQuery(@RequestParam(value = "userId",required = true) int id){

        return userService.getUserById(id);

    }



}
