package org.eclipse.jakarta.hello.controller;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.jakarta.hello.dto.Person;
import org.eclipse.jakarta.hello.service.PersonService;

@ApplicationScoped
@Path("person")
public class RestController {

	@Inject
	private PersonService personService;

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Person getPerson(@QueryParam("name") String name,@QueryParam("lastname") String lastname) {
		return personService.getPerson(name,lastname);
	}

	@POST
	@Produces( MediaType.APPLICATION_JSON)
	@Consumes({ MediaType.APPLICATION_JSON })
	public Person savePerson(Person person) {
		return personService.addPerson(person);
	}
}