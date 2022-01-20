package de.jdaclient.exceptions;

public class UnknownUserException extends Exception {

    public UnknownUserException(String errorMessage) {
        super(errorMessage);
    }
}
