package com.business.onlineMenu.exception;

import com.business.onlineMenu.common.Error;
import com.business.onlineMenu.common.ServiceResponse;
import com.business.onlineMenu.common.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Collections;

@ControllerAdvice
public class RestExceptionHandler {


  @ExceptionHandler(Exception.class)
  public ResponseEntity<ServiceResponse<Object>> handleGlobalException(Exception ex, WebRequest request) {
    Error error = new Error("INTERNAL_SERVER_ERROR", ex.getMessage());

    ServiceResponse<Object> serviceResponse = new ServiceResponse<>();
    serviceResponse.setStatus(Status.FAIL);
    serviceResponse.setErrors(Collections.singletonList(error));

    return new ResponseEntity<>(serviceResponse, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
