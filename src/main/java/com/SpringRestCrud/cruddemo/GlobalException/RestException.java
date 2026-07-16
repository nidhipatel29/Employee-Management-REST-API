package com.SpringRestCrud.cruddemo.GlobalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.SpringRestCrud.cruddemo.CustomExceptionClass.EmpNotFound;
import com.SpringRestCrud.cruddemo.ErrorResponse.ErrorResponce;

@ControllerAdvice
public class RestException {
       // Exception Handler using @ExceptionHandler
    @ExceptionHandler
    public ResponseEntity<ErrorResponce> handleException(EmpNotFound exc) {
        
        ErrorResponce error=new ErrorResponce();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimeStamp(System.currentTimeMillis());


        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

  

      //exception halder for generic 
    @ExceptionHandler
    public ResponseEntity<ErrorResponce> hanldeException(Exception exc){

       ErrorResponce error=new ErrorResponce();
       error.setStatus(HttpStatus.BAD_REQUEST.value());
       error.setMessage("not valid input");
       error.setTimeStamp(System.currentTimeMillis());
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
    
}
