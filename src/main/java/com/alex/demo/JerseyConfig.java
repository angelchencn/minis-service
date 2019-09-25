package com.alex.demo;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.alex.demo.rest.JerseyController;
import com.alex.demo.rest.SpringbootResource;
import com.alex.demo.rest.DepartmentResource;
import com.alex.demo.rest.EmployeeResource;

@Component
@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
        register(SpringbootResource.class);
        register(JerseyController.class);
        register(EmployeeResource.class);
        register(DepartmentResource.class);
    }

}
