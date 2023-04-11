package com.epam.esm.exception;
/**
 * The class that throws
 * Any Entity NotFound Exception
 * in an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
public class NotFoundAnyEntityException extends RuntimeException {

    public NotFoundAnyEntityException(String message) {
        super(message);
    }
}
