package com.springservice.clientTwo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clientTwo/ControllerTwo")
public class simpleControllerTwo {

    @RequestMapping(value="/EndpointOne", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> controllerClientOneEndpointOne() {
        return ResponseEntity.ok().body("This is hello endpoint one from controller two in client Two");
    }

    @RequestMapping(value="/EndpointTwo", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> controllerClientOneEndpointTwo() {
        return ResponseEntity.ok().body("This is hello endpoint two from controller two in client Two");
    }
}