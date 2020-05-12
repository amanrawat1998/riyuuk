package com.mindtree.covid.exceptions.service;

import com.mindtree.covid.exceptions.CovidApplicationException;

public class CovidServiceException extends CovidApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CovidServiceException() {
		super();
	}

	public CovidServiceException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public CovidServiceException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CovidServiceException(String arg0) {
		super(arg0);
	}

	public CovidServiceException(Throwable arg0) {
		super(arg0);
	}

}
