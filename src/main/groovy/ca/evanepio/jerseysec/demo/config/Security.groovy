package ca.evanepio.jerseysec.demo.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
class Security extends WebSecurityConfigurerAdapter {
    void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/greeting/**");
    }
}
