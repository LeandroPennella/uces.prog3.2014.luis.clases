package edu.programacion3.clase15042014;

@SuppressWarnings("serial")
public class MyException extends Exception {
	
	public MyException(String string, Exception e) {
		super(string,e);
	}
	
}
