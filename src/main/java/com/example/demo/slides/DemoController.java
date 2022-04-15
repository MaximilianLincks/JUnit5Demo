package com.example.demo.slides;

import com.example.demo.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public Greeting helloWorld(){
        return new Greeting("B4","world","hello!");
    }
}







