package com.sample.controller;

import com.sample.consts.RestConsts;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = RestConsts.V1 + RestConsts.HOME)
public class HomeController {

    @GetMapping
    public @ResponseBody String home(){
        return "Simple App - Home is responding !!! ";
    }

}
