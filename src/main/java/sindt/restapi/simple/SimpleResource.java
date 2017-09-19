package sindt.restapi.simple;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("simple")
public class SimpleResource {

	@GET
	public Response getSimple() {

		JsonObjectBuilder json = Json.createObjectBuilder();
		json.add("Simple", "Test");
		return Response.status(Status.OK).entity(json.build()).build();
	}

}
