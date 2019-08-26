package com.cts.contracttesting;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import io.restassured.module.mockmvc.RestAssuredMockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MsProducerApplicationTests {

	@Autowired
	PersonRestController personRestController;

	@MockBean
	PersonService personService;

	@Test
	public void contextLoads() {
	}

	@Before
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(personRestController);

		Mockito.when(personService.findPersonById(1)).thenReturn(new Person(1, "foo", "bee"));
	}

}
