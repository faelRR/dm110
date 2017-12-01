package br.inatel.pos.dm110.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/calc")
public interface CalcService {

	
	@GET
	@Path("/sum")
	@Produces(MediaType.APPLICATION_JSON)
	Result sum( @QueryParam("first") Float num1, @QueryParam("second") Float num2);
	
	@POST
	@Path("/subtract")
	@Produces(MediaType.APPLICATION_JSON)
	Result subtract( @FormParam("first") Float num1, @FormParam("second") Float num2);
	
}
