package br.edu.univas.si8.rest.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/fibcalc")
public interface FibService {
	@GET
	@Path("/fib/{num}")
	@Produces(MediaType.APPLICATION_JSON)	
	Result fibcalc(@PathParam("num") int num);
	
	
	


	

}
