package com.vitoria;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class GestaoVagasApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldReturnBadRequestWhenEmailIsInvalid() throws Exception {
		String payload = """
				{
				  "name": "Vitoria",
				  "email": "email-invalido",
				  "password": "1234567890"
				}
				""";

		mockMvc.perform(post("/candidate/")
						.contentType(MediaType.APPLICATION_JSON)
						.content(payload))
				.andExpect(status().isBadRequest());
	}

	@Test
	void shouldCreateCandidateWhenPayloadIsValid() throws Exception {
		String payload = """
				{
				  "name": "Vitoria",
				  "email": "vitoria@email.com",
				  "password": "1234567890"
				}
				""";

		mockMvc.perform(post("/candidate/")
						.contentType(MediaType.APPLICATION_JSON)
						.content(payload))
				.andExpect(status().isCreated());
	}

	@Test
	void shouldCreateCandidateWhenPayloadIsValidWithoutTrailingSlash() throws Exception {
		String payload = """
				{
				  "name": "Vitoria",
				  "email": "vitoria@email.com",
				  "password": "12345678"
				}
				""";

		mockMvc.perform(post("/candidate")
						.contentType(MediaType.APPLICATION_JSON)
						.content(payload))
				.andExpect(status().isCreated());
	}

}
