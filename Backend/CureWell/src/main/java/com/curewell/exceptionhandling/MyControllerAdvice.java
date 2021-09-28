package com.curewell.exceptionhandling;

import java.util.NoSuchElementException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException (NoSuchElementException elementException)
	{
		return new  ResponseEntity<String>("Invalid Input", HttpStatus.NOT_FOUND);
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
	@ExceptionHandler(HttpMessageNotReadableException.class)
	public ResponseEntity<String> handleHttpMessageNotReadableException(HttpMessageNotReadableException elementException)
	{
		return new  ResponseEntity<String>("contact number should not be preceeded with 0 ", HttpStatus.BAD_REQUEST);
	}

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handlAllException (Exception elementException)
	{
		return new  ResponseEntity<String>("Exception has occured", HttpStatus.BAD_REQUEST);
	}
 
}
