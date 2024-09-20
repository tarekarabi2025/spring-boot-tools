package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World !";
    }

    // expose a new endpoint for "work out"

    @GetMapping("/workout")
    public String getDailyWorkOut(){
        return "run a hard 5k , work out done!";
    }

    //expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "today is your lucky day!";
    }



}
