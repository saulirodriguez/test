package com.agilesolutions.test.exception;

public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(String resource, String message) {
        super(resource + ": " + message);
    }

    public ResourceNotFoundException(String resource) {
        super(resource + " not found.");
    }
}
