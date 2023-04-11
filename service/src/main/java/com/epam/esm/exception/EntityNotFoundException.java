package com.epam.esm.exception;
/**
 * The class that throws
 * Entity NotFound Exception
 * in an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
public class EntityNotFoundException extends RuntimeException {

    private final Object param;

    public EntityNotFoundException(String messageCode, Object param) {
        super(messageCode);
        this.param = param;
    }

    public Object getParam() {
        return param;
    }
}
