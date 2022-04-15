package com.example.demo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor
public class Greeting {

    private final String from;
    private final String to;
    private final String greeting;
}
