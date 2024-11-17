package com.upgrad.Upgrad_Springboot.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // how many controllers? -> 2

    // name of controllers? -> /greet, /info

    // URL: localhost:8081/greet
    // URL: localhost:8081/info


    // Types controllers? -> GET API


    // @GetMapping -> get REST API Controller
    // params: name {key} = siddharth {value}

    // http://localhost:8081/greet?name=Siddharth

    @GetMapping("/greet")
    public String greet(@RequestParam(value = "name",defaultValue = "World")String name){
        return "Hello, " + name + "!";
    }

    // no params -> get api mapping
    @GetMapping("/info")
    public String info() {
        return "This is a simple Spring Boot application with two endpoints.";
    }



}
