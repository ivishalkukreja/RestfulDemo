package com.vish.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/rest")
public class WelcomeService {
	@Path("/welcome")
	@GET
	@Produces("plaint/text")
	public Response welcomeGreetings() {
		return Response.status(200).entity("Welcome to REST").build();
	}
}
