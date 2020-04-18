package com.zuulproxy.mainserver.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/simpleZuul/Controller")
public class simpleZuulController {

    @RequestMapping(value="/simpleZuulEndpoint", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> controllerClientOneEndpointOne() {
        return ResponseEntity.ok().body("This is hello zuul endpoint from zuul controller in zuul proxy service.");
    }
}