package com.example.sp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class GreetingsController {
    @GetMapping("/hii")
    public String hiii(){
        return "hii how are you";

    }
    @GetMapping("/goodbye")
    public String goodbye(){
        return "byee";

    }
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name){
        return "hii"+name+"!!";

    }
    @GetMapping("/sumes")
    public int sum(@RequestParam int a , @RequestParam int b ){
        return a+b;
    }

}
