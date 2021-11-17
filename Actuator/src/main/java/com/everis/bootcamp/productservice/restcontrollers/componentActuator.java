package com.everis.bootcamp.productservice.restcontrollers;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id="miEndpoint")
public class componentActuator {
	
	@GetMapping("/custom")
	public ResponseEntity<String> miEndPoint(){
		return new ResponseEntity<>("Endpoint customizado", HttpStatus.OK);
	}
	
}
