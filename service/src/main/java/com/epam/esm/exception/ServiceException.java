package com.epam.esm.exception;
/**
 * The class that throws
 *  Exception
 * in an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
import com.epam.esm.error.*;
public class ServiceException extends RuntimeException {

    /*private final String errorCode;

    public ServiceException(UnUse error) {

        super(error.getMessage());
        this.errorCode = error.getCode();
    }

    public String getErrorCode() {
        return errorCode;
    }*/
}
