package com.tbs.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.ems.exceptions.ErrorDetails;
import com.ems.exceptions.PropertyAlreadyExistException;
import com.ems.exceptions.ResourceNotFoundException;

public class GlobalException {
	//handler method for handling specific exception
		@ExceptionHandler(ResourceNotFoundException.class)
		public ResponseEntity<?> resourceNotFoundHandling(ResourceNotFoundException ex,
				WebRequest request)
		{
			ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
					request.getDescription(false));
			return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
		}
		
		@ExceptionHandler(PropertyAlreadyExistException.class)
		public ResponseEntity<?> emailAlreadyExistHandling(PropertyAlreadyExistException ex,
				WebRequest request)
		{
			ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
					request.getDescription(false));
			return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
		}
}
