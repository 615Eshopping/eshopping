package com.eshopping.exception;

/**
 * Created by AnKh on 2017/3/2.
 */
public class RequestParamException extends RuntimeException{
    public RequestParamException(String message) {
        super(message);
    }

    public RequestParamException(String message, Throwable cause) {
        super(message, cause);
    }
}
