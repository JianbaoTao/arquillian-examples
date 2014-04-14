package learn.jboss;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HelloWorld {
    @GET
    @Path("hello")
    public String hello() {
        return "Hello, World!";
    }
}
