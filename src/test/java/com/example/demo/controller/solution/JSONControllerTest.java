package com.example.demo.controller.solution;

import com.example.demo.controller.JSONController;
import com.example.demo.model.Greeting;
import com.example.demo.service.GreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class JSONControllerTest {

    MockMvc mockMvc;

    @Mock
    GreetingService greetingService;

    @InjectMocks
    JSONController jsonController;

    Set<Greeting> greetings;

    Greeting greeting = new Greeting("Maxi","B4","Cactus = Good");

    @BeforeEach
    void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(jsonController).build();
        greetings = new HashSet<>();
    }

    @Test
    void greet() throws Exception {

        when(greetingService.addGreeting(anyString(),anyString(),anyString())).thenReturn(greeting);

        mockMvc.perform(MockMvcRequestBuilders.get("/api/greetings/from/to/greeting"))
                .andExpect(jsonPath("$.from").value("Maxi"))
                .andExpect(content().json("{\"from\": \"Maxi\",\"to\": \"B4\",\"greeting\": \"Cactus = Good\"}"))
                .andExpect(status().isOk());

        verify(greetingService,times(1)).addGreeting(any(),any(),any());
    }

    @Test
    void testGreet() {
    }
}