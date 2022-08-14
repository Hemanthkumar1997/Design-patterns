package com.solid.principles.singleresponsibility;

import lombok.RequiredArgsConstructor;

/**
 * Every class should have a single Responsibility
 * Role of controller is to handle requests and response
 * It should not do handle other things like validation in the same class
 */
@RequiredArgsConstructor
public class Controller {

    private final Validator validator;
    private final Service service;

    public Object handleRequest(String id) {
        validator.validate(id);
        return service.process(id);
    }
}
