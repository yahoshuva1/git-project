package com.gitproject;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello learning git";
    }

    @GetMapping("/send")
    public String sendMessage(){
        return "Hi";
    }
}
