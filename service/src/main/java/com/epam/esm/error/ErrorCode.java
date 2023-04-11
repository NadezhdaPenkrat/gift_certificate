package com.epam.esm.error;
/**
 * The class that represents
 * Enum Code Error
 * in an API for basic operations
 * with the application
 *
 * @author Nadezhda Penkrat
 */
public enum ErrorCode {

    TAG_IS_NULL("EXV00500"),
    TAG_NAME_IS_EMPTY("EXV00501"),
    TAG_NAME_LENGTH_MIN("EXV00502"),
    TAG_NAME_LENGTH_MAX("EXV00503"),
    TAG_WITH_SAME_NAME_NOT_EXIST("EXV00504"),
    TAG_INVALID_ID("EXV00505"),
    TAG_WRONG_TYPE_ID("EXV00506"),

    TAG_NOT_EXIST("EX00550"),
    TAG_UNIQ_NAME("EX00551"),
    TAG_NOT_FOUND("EX00552"),

    CERTIFICATE_IS_NULL("EXV00400"),
    INCORRECT_CERTIFICATE_ID("EXV00401"),
    WRONG_TYPE_CERTIFICATE_ID("EXV00402"),
    CERTIFICATE_NAME_IS_EMPTY("EXV00403"),
    CERTIFICATE_NAME_LENGTH_MIN("EXV00404"),
    CERTIFICATE_NAME_LENGTH_MAX("EXV00405"),
    CERTIFICATE_WITH_SAME_NAME_NOT_EXIST("EXV00406"),
    CERTIFICATE_DESCRIPTION_IS_NULL("EXV00407"),
    CERTIFICATE_DESCRIPTION_LESS("EXV00408"),
    CERTIFICATE_DESCRIPTION_MORE("EXV00409"),
    CERTIFICATE_PRICE_IS_NULL("EXV00410"),
    CERTIFICATE_PRICE_IS_NEGATIVE("EXV00411"),
    CERTIFICATE_DURATION_IS_NULL("EXV00412"),

    CERTIFICATE_NOT_EXIST("EX00450"),
    CERTIFICATE_NOT_FOUND("EX00451");

    private final String code;

    ErrorCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
