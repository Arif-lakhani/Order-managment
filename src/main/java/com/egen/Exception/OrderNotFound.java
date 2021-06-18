package com.egen.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
public class OrderNotFound {

    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public static class OrderNotFoundException extends RuntimeException {

        public OrderNotFoundException(String msg) {
            super(msg);
        }
    }
}