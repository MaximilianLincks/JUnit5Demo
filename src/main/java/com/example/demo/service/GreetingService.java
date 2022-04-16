package com.example.demo.service;

import com.example.demo.model.Greeting;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class GreetingService {

    private final Set<Greeting> greetings = new HashSet<>();

    public Greeting addGreeting(String from, String to, String greetingString){
        Greeting greeting = Greeting.builder()
                .from(from)
                .to(to)
                .greeting(greetingString)
                .build();
        greetings.add(greeting);
        return greeting;
    }
//TODO implement
//    public Set<Greeting> getGreetings(){
//        return greetings;
//    }
//
//    public Set<Greeting> getGreetingsTo(String receiver){
//        return getGreetings()
//                .stream()
//                .filter(greeting -> greeting.getTo().equals(receiver))
//                .collect(Collectors.toSet());
//    }
}
