package com.example.cinematicketsbookingapp.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class ScreeningNotFoundException extends RuntimeException{
    public ScreeningNotFoundException(String message){
        super(message);
    }

}
