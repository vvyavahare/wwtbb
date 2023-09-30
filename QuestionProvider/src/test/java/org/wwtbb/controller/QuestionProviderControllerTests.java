package org.wwtbb.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.MvcResult;
import org.wwtbb.service.QuestionProviderService;

@WebMvcTest(QuestionProviderController.class)
class QuestionProviderControllerTests {
    private static final String END_POINT_PATH = "/questions";

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;
    @MockBean
    private QuestionProviderService service;

//    @Test
//    public void testAddShouldReturn400BadRequest() throws Exception {
//        Question newUser = new Question();
//        newUser.setQuestionString("dd");
//
//        String requestBody = objectMapper.writeValueAsString(newUser);
//
//        mockMvc.perform(get(END_POINT_PATH).contentType("application/json")
//                        .content(requestBody))
//                .andExpect(status().isBadRequest())
//                .andDo(print());
//    }

    @Test
    void testGetAllQuestionsShouldReturn200() throws Exception {

        MvcResult result = mockMvc.perform(get(END_POINT_PATH).contentType("application/json"))
                .andExpect(status().is2xxSuccessful())
                .andDo(print()).andReturn();
        String expected = "[{\"id\":1,\"questionString\":\"What is the capital of France?\",\"score\":2}]";
//        JSONAssert.assertEquals(expected, result.getResponse().getContentAsString(), false);
    }

}