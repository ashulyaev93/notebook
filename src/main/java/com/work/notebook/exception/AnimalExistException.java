package com.work.notebook.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AnimalExistException extends Throwable {
    public AnimalExistException(String message) {
        super(message);
    }
}
