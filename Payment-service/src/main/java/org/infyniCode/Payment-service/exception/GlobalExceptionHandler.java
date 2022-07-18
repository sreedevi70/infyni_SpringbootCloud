package org.application.exception;

import org.application.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(org.application.exception.PaymentException.class)
    public ResponseEntity<ErrorResponse> handlingPaymentException(org.application.exception.PaymentException paymentException){
        return new ResponseEntity<>(ErrorResponse
                .builder()
                .message(paymentException.getErrorMessage())
                .build(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handlingException(Exception exception){
        return new ResponseEntity<>(ErrorResponse
                .builder()
                .message(exception.getLocalizedMessage())
                .build(), HttpStatus.BAD_REQUEST);
    }
    private ErrorResponse getErrorResponse(String errorMessage){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(errorMessage);
        errorResponse.setCode(HttpStatus.BAD_REQUEST.toString());
        return errorResponse;
    }

}

