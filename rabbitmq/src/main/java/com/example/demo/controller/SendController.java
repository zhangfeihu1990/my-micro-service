package com.example.demo.controller;

import com.example.demo.sender.FirstSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by Administrator on 2019/3/4.
 */

@RestController
public class SendController {
    @Autowired
    private FirstSender firstSender;

    @GetMapping("/send")
    public String send(String message){
        String uuid = "fsdfsfdfdsffd";//UUID.randomUUID().toString();
        firstSender.send(uuid,message);
        return uuid;
    }
}
