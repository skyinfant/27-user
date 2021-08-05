package com.tomorrowcat.userapp.controller;

import com.tomorrowcat.userServiceApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * @description:  通过id查用户
     * @param: id
     * @return: Object
     */
    @RequestMapping("/getUser")
    public Object testQuery(@RequestParam(value = "userId",required = true) int id){

        return userService.getUserById(id);

    }


    @RequestMapping("test")
    public String test(){
        return "12345";
    }
}
