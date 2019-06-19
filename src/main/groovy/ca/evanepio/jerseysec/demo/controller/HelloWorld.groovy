package ca.evanepio.jerseysec.demo.controller

import org.springframework.stereotype.Component

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Component
@Path("/greeting")
class HelloWorld {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Map<String, String> greeting() {
        return [greeting:"Hello, Jersey World!"]
    }
}
