package com.imooc.smallapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class HelloController {

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello, SpringBoot !";
    }

}
