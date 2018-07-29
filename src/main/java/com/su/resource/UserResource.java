/**
 * 
 */
package com.su.resource;

import java.util.ArrayList;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;

import com.su.entities.User;
import com.su.services.Services;

@Path("/users")

public class UserResource {

	@Inject
	Services services;

	@GET
	@Path("/welcome")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response welCome() {
		return Response.ok("Welcome").build();
	}

	@GET
	@Path("/userDetails")
	@Produces(MediaType.APPLICATION_JSON)
	public Response Users() {
		ArrayList<User> userDetails = services.viewUsers();
		return Response.ok(userDetails).build();
	}

}
