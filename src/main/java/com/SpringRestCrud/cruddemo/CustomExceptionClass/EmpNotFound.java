package com.SpringRestCrud.cruddemo.CustomExceptionClass;

public class EmpNotFound  extends RuntimeException{

    public EmpNotFound(String message) {
        super(message);
    }

    public EmpNotFound(Throwable cause) {
        super(cause);
    }

    public EmpNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    
    
}
