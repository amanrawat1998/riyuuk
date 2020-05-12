package com.mindtree.covid.exceptions;

public class CovidApplicationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CovidApplicationException() {
		super();
	}

	public CovidApplicationException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public CovidApplicationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CovidApplicationException(String arg0) {
		super(arg0);
	}

	public CovidApplicationException(Throwable arg0) {
		super(arg0);
	}

}
