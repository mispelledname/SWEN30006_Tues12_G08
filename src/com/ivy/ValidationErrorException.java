package com.ivy;
import java.lang.Exception;

public class ValidationErrorException extends Exception {

    public ValidationErrorException(String message) {
        super(message);
    }
}
