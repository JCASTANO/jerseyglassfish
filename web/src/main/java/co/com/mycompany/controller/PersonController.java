package co.com.mycompany.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.mycompany.domain.Person;
import co.com.mycompany.repository.MysqlPersonRepository;
import co.com.mycompany.service.PersonService;

@Path("/person")
public class PersonController {

  private PersonService personService;
	
  public PersonController() {
	 this.personService = new PersonService(new MysqlPersonRepository());
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
  public Person get() {
    return this.personService.find();
  }
}
