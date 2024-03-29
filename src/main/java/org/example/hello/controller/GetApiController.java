package org.example.hello.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping(path = "/hi" , method = RequestMethod.GET)
    public String hi(){
        return "hi";
    }

    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName, String name){
        return "dd";
    }
}
