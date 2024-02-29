package com.consulting.testprojectconsultingrest.controllers;

import com.consulting.testprojectconsultingrest.TestUtils;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(TextProcessingController.class)
public class TextProcessingControllerTest {

//    @MockBean
//    private TextProcessingService service;
//
//    @Autowired
//    private MockMvc mock;
//
//    @Test
//    public void testThatGetMappingReturnsCorrectJson() throws Exception {
//        mock.perform(MockMvcRequestBuilders.post("/checkText")
//                        .contentType(MediaType.TEXT_PLAIN)
//                        .content("abccc"))
//                .andExpect(status().isCreated());
//    }
//
//    @Test
//    public void testThatPostMapping() throws Exception {
//        Mockito.when(service.allCharsMap()).thenReturn(TestUtils.createMapABCCC());
//
//        mock.perform(MockMvcRequestBuilders.get("/checkText")
//                        .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(jsonPath("$.['c']", Matchers.is(3)))
//                .andExpect(jsonPath("$.['a']", Matchers.is(1)))
//                .andExpect(jsonPath("$.['b']", Matchers.is(1)));
//    }
}
