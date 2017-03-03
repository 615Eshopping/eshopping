package com.eshopping.exception;

/**
 * Created by AnKh on 2017/3/3.
 */
public class ResourceOperationFailException extends RuntimeException{
    public ResourceOperationFailException(String message) {
        super(message);
    }

    public ResourceOperationFailException(String message, Throwable cause) {
        super(message, cause);
    }
}
