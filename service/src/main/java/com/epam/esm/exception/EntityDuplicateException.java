package com.epam.esm.exception;
/**
 * The class that throws
 * Entity Duplicate Exception
 * in an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
public class EntityDuplicateException extends RuntimeException {

    private final Object param;

    public EntityDuplicateException(String messageCode, Object param) {
        super(messageCode);
        this.param = param;
    }

    public Object getParam() {
        return param;
    }
}
