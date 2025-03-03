package com.example.MyApiApplication.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(MyController.class)
class MyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testSayHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/api/hello"))
                .andExpect(status().isOk())  // Verifica que el estado HTTP sea 200 OK
                .andExpect(content().string("Hello, World!")); // Verifica que el contenido sea el esperado
    }
}
