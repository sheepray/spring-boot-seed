package io.rui.spring.config;

import io.rui.spring.rest.StatusController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

@ApplicationPath("/jersey")
@Configuration
public class JerseyConfiguration extends ResourceConfig{
    @PostConstruct
    public void setUp() {
        register(StatusController.class);
    }
}
