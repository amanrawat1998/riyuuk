package com.mindtree.covid.exceptions.custom;

import com.mindtree.covid.exceptions.service.CovidServiceException;

public class PatientException extends CovidServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PatientException() {
		super();
	}

	public PatientException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public PatientException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public PatientException(String arg0) {
		super(arg0);
	}

	public PatientException(Throwable arg0) {
		super(arg0);
	}
}
