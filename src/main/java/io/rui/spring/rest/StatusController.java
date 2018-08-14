package io.rui.spring.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/status")
public class StatusController {
    @GET
    public String getStatus() {
        return "jersey here, service is up";
    }
}
