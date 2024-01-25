package org.example.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //rest api를 처리해주는 comntroller
@RequestMapping("/api") //uri를 지정해주는 annotation

public class ApiController {

    @GetMapping("/hello") // http://localhost:8080/api/hello
    public String hello(){
        return "hello spring boot";
    }


}
