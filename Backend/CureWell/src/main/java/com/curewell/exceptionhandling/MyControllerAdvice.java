package com.curewell.exceptionhandling;

import java.util.NoSuchElementException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException (NoSuchElementException elementException)
	{
		return new  ResponseEntity<String>("No Such value present", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleNullPointerException (NullPointerException elementException)
	{
		return new  ResponseEntity<String>("Null pointer Exception", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmptyResultDataAccessException.class)
	public ResponseEntity<String> handleEmptyResultDataAccessException (EmptyResultDataAccessException elementException)
	{
		return new  ResponseEntity<String>("No Such Value Present", HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handlAllException (Exception elementException)
	{
		return new  ResponseEntity<String>("Exception has occured", HttpStatus.BAD_REQUEST);
	}
 
}
