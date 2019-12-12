package com.sejin.jpa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;
import static org.springframework.restdocs.request.RequestDocumentation.parameterWithName;
import static org.springframework.restdocs.request.RequestDocumentation.pathParameters;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
@AutoConfigureRestDocs
class SpringRestdocsExampleApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("hello test")
    void helloRestdocs() throws Exception {
        //given

        //when
        ResultActions result = this.mockMvc
                .perform(RestDocumentationRequestBuilders.get("/{name}", "test"));

        //then
        result
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello, restdocs")))
                .andDo(document("hello",
                        pathParameters(
                                parameterWithName("name").description("이름")
                        ),
                        responseFields(
                                fieldWithPath("message").description("The welcome message for the user.")
                        )));
    }
}
