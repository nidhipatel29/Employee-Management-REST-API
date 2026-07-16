package com.SpringRestCrud.cruddemo.ErrorResponse;

public class ErrorResponce {
    private String message;
    private long timeStamp;
    private int status;

    public  ErrorResponce(){

    }

    public ErrorResponce(String message, int timeStamp, int status) {
        this.message = message;
        this.timeStamp = timeStamp;
        this.status = status;
    }

    //getter setter

    public String getMessage() {
        return message;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
}
    

