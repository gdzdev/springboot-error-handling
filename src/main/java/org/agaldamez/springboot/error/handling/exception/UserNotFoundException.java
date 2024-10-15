package org.agaldamez.springboot.error.handling.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException (String message) {
        super(message);
    }
}
