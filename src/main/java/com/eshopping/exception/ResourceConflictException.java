package com.eshopping.exception;

/**
 * Created by AnKh on 2017/3/2.
 */
public class ResourceConflictException extends RuntimeException{
    public ResourceConflictException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourceConflictException(String message) {
        super(message);
    }
}
