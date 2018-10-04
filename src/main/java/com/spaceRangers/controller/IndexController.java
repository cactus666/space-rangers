package com.spaceRangers.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController{

    @RequestMapping("/")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/kek")
    public String getKek(){
        return "index";
    }
}