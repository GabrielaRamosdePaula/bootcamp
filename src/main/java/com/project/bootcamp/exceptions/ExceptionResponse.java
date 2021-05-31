package com.project.bootcamp.exceptions;

public class ExceptionResponse {

    private String messsage;

    public ExceptionResponse (String messsage){
        this.messsage = messsage;
    }

    public String getMesssage() {
        return messsage;
    }

    public void setMesssage(String messsage) {
        this.messsage = messsage;
    }
}
