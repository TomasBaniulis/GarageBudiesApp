package lt.code.academy.autobiciuliaiapi.garages;

import lt.code.academy.autobiciuliaiapi.garages.exception.GarageDoesNotExistRunTimeException;
import lt.code.academy.autobiciuliaiapi.garages.exception.GarageExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GarageControllerAdvice {
    @ExceptionHandler(GarageDoesNotExistRunTimeException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public GarageExceptionResponse handleGarageNotExistRunTimeException (GarageDoesNotExistRunTimeException exception){
        return new GarageExceptionResponse(String.format("Garage does not exist with this %s id", exception.getId()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public GarageExceptionResponse handleGarageException (Exception exception){
        return new  GarageExceptionResponse(exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
