package com.springservice.clientone.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clientOne/ControllerOne")
public class simpleControllerOne {

    @RequestMapping(value="/EndpointOne", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> controllerClientOneEndpointOne() {
        return ResponseEntity.ok().body("This is hello endpoint one from controller one in client One");
    }

    @RequestMapping(value="/EndpointTwo", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> controllerClientOneEndpointTwo() {
        return ResponseEntity.ok().body("This is hello endpoint two from controller one in client One");
    }
}