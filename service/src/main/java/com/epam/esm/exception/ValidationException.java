package com.epam.esm.exception;
/**
 * The class that throws
 * Validation Exception
 * in an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
public class ValidationException extends RuntimeException {

    public ValidationException(String message) {
        super(message);
    }
}
