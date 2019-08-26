package com.cts.contracttesting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class PersonRestController {

	private final PersonService personService;

	public PersonRestController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("/person/{id}")
	public Person findPersonById(@PathVariable("id") Integer id) {
		return personService.findPersonById(id);
	}
	@GetMapping("/get")
	public String applicationIsUp() {
		return "Producer Service is running...";
	}
}
