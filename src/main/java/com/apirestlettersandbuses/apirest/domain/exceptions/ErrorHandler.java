package com.apirestlettersandbuses.apirest.domain.exceptions;

public class ErrorHandler extends  RuntimeException{


    public ErrorHandler(String message){
        super(message);
    }
}
