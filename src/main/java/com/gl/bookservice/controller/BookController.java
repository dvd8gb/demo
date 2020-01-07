package com.gl.bookservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "hello"+"asheesh";
    }


}
