package co.com.mycompany.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.mycompany.domain.Person;

@Path("/api/service")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MyService {

	@Path("person")
	@GET
	public Person person(){
		return new Person("juan esteban castaño rincon");
	}

}
