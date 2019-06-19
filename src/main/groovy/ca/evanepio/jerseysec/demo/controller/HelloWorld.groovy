package ca.evanepio.jerseysec.demo.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorld {
    @RequestMapping("/greeting")
    Map<String, String> greeting() {
        return [greeting:"Hello, World!"]
    }
}
