package com.zd.learn.springboot.controller;

import com.zd.learn.springboot.model.MyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hw")
public class HelloWorldController {

    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;
    @Value("${profile}")
    private String profile;

    @Autowired
    private MyInfo myInfo;

    @GetMapping("/index")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/bookinfo")
    public String bookInof(){
        return bookName + " - " + bookAuthor;
    }

    @GetMapping("/myinfo")
    public String myInfo() {
        return myInfo.toString();
    }

    @GetMapping("/profile")
    public String getProfile() {
        return profile;
    }
}
