package com.company.Summative1MalaniRyan.controllers;

import com.company.Summative1MalaniRyan.models.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@WebMvcTest(MagicController.class)

public class MagicControllerTest {

    // wiring in the MockMvc object
    @Autowired
    private MockMvc mockMvc;

    // ObjectMapper used to convert Java objects to JSON and vice versa
    private ObjectMapper mapper = new ObjectMapper();

    private List<Magic> magicList;

    @Before
    public void setUp() throws Exception {

    }

    // Testing POST /records
    @Test
    public void shouldReturnNewMagic() throws Exception {

        // ARRANGE
        Magic inputMagic = new Magic();
        inputMagic.setQuestion("Will you be mine?");
        inputMagic.setAnswer("Yes.");

        // Convert Java Object to JSON
        String inputJson = mapper.writeValueAsString(inputMagic);

        Magic outputMagic = new Magic();
        outputMagic.setId(21);
        outputMagic.setQuestion("Will you be mine?");
        outputMagic.setAnswer("Yes.");

        // Convert Java Object to JSON
        String outputJson = mapper.writeValueAsString(outputMagic);

        // ACT
        mockMvc.perform(
                        post("/magic")                            // Perform the POST request
                                .content(inputJson)                            // Set the request body
                                .contentType(MediaType.APPLICATION_JSON)       // Tell the server it's in JSON format
                )
                .andDo(print())                                // Print results to console
                .andExpect(status().isCreated());              // ASSERT (status code is 201)
    }
}