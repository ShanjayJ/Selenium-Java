package com.vmetry.exceptions;

@SuppressWarnings("serial")
public class InvalidInputException extends Exception {
	public InvalidInputException(String expMsg) {
		super(expMsg);
	}

}
