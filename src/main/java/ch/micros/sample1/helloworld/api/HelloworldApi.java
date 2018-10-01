package ch.micros.sample1.helloworld.api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/helloworld")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2018-10-01T16:22:46.982+02:00[Europe/Zurich]")
public interface HelloworldApi {

    @GET
    @Path("/{message}")
    @Produces({ "application/json" })
    Response sayHelloworld(@PathParam("message") String message);
}
