package com.theabhikdatta.blog.rest.api.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class BlogApiException extends RuntimeException{
    @Getter
    private HttpStatus status;
    private String message;

    public BlogApiException(HttpStatus status, String message){
        this.status = status;
        this.message = message;
    }

    public BlogApiException(String customMessage, HttpStatus status, String message){
        super(customMessage);
        this.status = status;
        this.message = message;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
