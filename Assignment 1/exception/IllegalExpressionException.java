package com.metacube.exception;

/**
 * An Exception class
 * @author Amit Sharma
 *
 */
public class IllegalExpressionException extends Exception{
	String message(){
		return "Illegal infix Expression entered";
	}

}
