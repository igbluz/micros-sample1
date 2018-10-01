package ch.micros.sample1.helloworld;


import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import ch.micros.sample1.helloworld.api.HelloworldApi;

@RequestScoped
@Path("/helloworld")
public class HelloworldImpl implements HelloworldApi {
	

	@Override
	public Response sayHelloworld(String message) {
		return Response.ok("Hi "+message).build();
	}
}