package com.example.demo.model;

import lombok.*;

@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
@Builder
public class Greeting {

    private final String from;
    private final String to;
    private final String greeting;
}
