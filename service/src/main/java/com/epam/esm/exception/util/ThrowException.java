package com.epam.esm.exception.util;

import com.epam.esm.exception.ValidationException;
import org.springframework.stereotype.Component;

import java.util.List;
/**
 * The class that throws exception
 * in an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
@Component
public class ThrowException {

    public void throwValidationException(List<String> list) {
        throw new ValidationException(String.join(", ", list));
    }


}
