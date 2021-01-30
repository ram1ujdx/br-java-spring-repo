package com.example.studentapp.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.studentapp.dto.ErrorResponse;
import com.example.studentapp.exception.StudentAlreadyExistException;
import com.example.studentapp.exception.StudentNotFoundException;

@RestControllerAdvice
public class ErrorRestController {

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = {StudentNotFoundException.class})
	public ErrorResponse handleNotFoundException(Exception ex,HttpServletRequest request) {
		return new ErrorResponse(new Date(), HttpStatus.NOT_FOUND.getReasonPhrase(), ex.getClass().getName(), ex.getMessage(), request.getRequestURI());
	}
	
	
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = {StudentAlreadyExistException.class})
	public ErrorResponse handleAlreadyExistException(Exception ex,HttpServletRequest request) {
		return new ErrorResponse(new Date(), HttpStatus.BAD_REQUEST.getReasonPhrase(), ex.getClass().getName(), ex.getMessage(), request.getRequestURI());
	}
	
}
