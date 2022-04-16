package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class JSONController {

    private final GreetingService greetingService;

    @GetMapping("/greetings/{from}/{to}/{greeting}")
    public Greeting greet(@PathVariable String from, @PathVariable String to, @PathVariable String greeting){
        return greetingService.addGreeting(from,to,greeting);
    }
//TODO implement
//    @GetMapping("/greetings/all")
//    public Set<Greeting> getAllGreetings(){
//        return greetingService.getGreetings();
//    }
//
//    @GetMapping("/greetings/{to}")
//    public Set<Greeting> getGreetingsTo(@PathVariable String to){
//        return greetingService.getGreetingsTo(to);
//    }
}
