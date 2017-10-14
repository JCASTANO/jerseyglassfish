package co.com.mycompany.service;

import co.com.mycompany.domain.Person;
import co.com.mycompany.repository.PersonRepository;

public class PersonService {

	private PersonRepository personRepository;
	
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public Person find() {
		return this.personRepository.find();
	}
}
