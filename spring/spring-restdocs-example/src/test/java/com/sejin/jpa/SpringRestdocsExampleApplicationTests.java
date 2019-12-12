package com.sejin.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = HelloController.class)
@AutoConfigureRestDocs(outputDir = "target/snippets")
class SpringRestdocsExampleApplicationTests {


	@Autowired
	private MockMvc mockMvc;

	@Test
	void helloRestdocs() throws Exception {
		//given

		//when
		ResultActions result = this.mockMvc.perform(get("/"));
		//then
        result.andExpect(status().isOk())
				.andExpect(content().string(containsString("Hello, restdocs")))
				.andDo(document("hello"));
	}
}
