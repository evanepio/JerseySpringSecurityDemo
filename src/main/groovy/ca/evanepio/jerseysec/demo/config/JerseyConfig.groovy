package ca.evanepio.jerseysec.demo.config

import ca.evanepio.jerseysec.demo.controller.HelloWorld
import org.glassfish.jersey.server.ResourceConfig
import org.springframework.stereotype.Component

@Component
class JerseyConfig extends ResourceConfig{

    /**
     * In constructor we can define Jersey Resources &amp; Other Components
     */
    JerseyConfig() {
        register(HelloWorld)
    }
}
