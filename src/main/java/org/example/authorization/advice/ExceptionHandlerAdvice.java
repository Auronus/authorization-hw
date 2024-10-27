package org.example.authorization.advice;

import org.example.authorization.handlers.InvalidCredentials;
import org.example.authorization.handlers.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> invalidCredentialsHandler(InvalidCredentials ic) {
        return new ResponseEntity<>(ic.getMessage(), HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> invalidCredentialsHandler(UnauthorizedUser ic) {
        return new ResponseEntity<>(ic.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
