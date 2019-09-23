package com.alex.demo;

import java.net.URI;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryClientController {
	//@Autowired
    //private DiscoveryClient discoveryClient;
 
    //public Optional<URI> serviceUrl() {
    //    return discoveryClient.getInstances("minis-service")
    //      .stream()
    //      .map(si -> si.getUri()).findFirst();
  //        .findFirst()
    //}
    
    
    /*@GetMapping("/discoveryClient")
    public String discoveryPing() throws RestClientException, 
      ServiceUnavailableException {
        URI service = serviceUrl()
          .map(s -> s.resolve("/ping"))
          .orElseThrow(ServiceUnavailableException::new);
        return restTemplate.getForEntity(service, String.class)
          .getBody();
    }*/
     
    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
	
    @GetMapping("/health")
    public ResponseEntity<String> myCustomCheck() {
        String message = "Testing my healh check function";
        return new ResponseEntity<>(message, HttpStatus.FORBIDDEN);
    }
}
