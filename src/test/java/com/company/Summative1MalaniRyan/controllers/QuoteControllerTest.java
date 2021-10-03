package com.company.Summative1MalaniRyan.controllers;

import com.company.Summative1MalaniRyan.models.Quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteController.class)

public class QuoteControllerTest {

    // wiring in the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    private List<Quote> quoteList;

    @Before
    public void setUp() throws Exception {

    }

    // testing HTTP method GET URI /quote

    @Test
    public void shouldGetRandomQuote() throws Exception {

        // ARRANGE
        // convert Java object to JSON
        String outputJson = mapper.writeValueAsString(quoteList);

        // ACT
        mockMvc.perform(get("/quote"))        // Perform the GET request
                .andDo(print())                            // Print results to console
                .andExpect(status().isOk());               // ASSERT (status code is 200)
    }
}