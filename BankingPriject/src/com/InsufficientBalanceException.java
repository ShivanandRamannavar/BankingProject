  package com;

public class InsufficientBalanceException extends RuntimeException{
	 private String message;
	InsufficientBalanceException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
/**
 Rules to work with Custom Exception
 1. Create a class with the exception name
 2. a) if a class extends RunTimeException -->Unchecked Exception 
    b) if a class extends Exception --> Checked Exception
 3. Override getMessage() -> (variable, Constructor, method)
 4. invoke the exception object using throw keyword,
 handle it using try and catch block with suitable message.
*/