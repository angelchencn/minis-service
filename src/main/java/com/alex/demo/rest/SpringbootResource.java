package com.alex.demo.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("resource")
public class SpringbootResource {
	@Autowired
    private ISomeService someService;

    @Path("sayhi")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHi(@QueryParam("msg") String msg) {
        this.someService.sayHi(msg);
        return "success";
    }
}
