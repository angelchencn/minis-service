package com.alex.demo.rest;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Singleton 
@Component
@RestController
@Path("/config")
public class JerseyController {
	     
     /////////////////Configuration////////////////////////
     @GET
     @Path("/health")
     //定义请求的媒体类型，如果不指定，则容器默认可接受任意媒体类型，容器负责确认被调用的方法可接受HTTP请求的媒体类型，否则返回415 Unsupported Media Type
     @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
     //定义响应媒体类型，如果不指定，则容器默认可接受任意媒体类型，容器负责确认被调用的方法可返回HTTP请求可以接受媒体类型，否则返回406 Not Acceptable
     @Produces(MediaType.APPLICATION_JSON)
     public ResponseEntity<String> health() {
         String message = "Testing my healh check function";
         return new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
     }
     
     
     
}
