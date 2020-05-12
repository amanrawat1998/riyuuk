package com.mindtree.covid.exceptions.custom;

import com.mindtree.covid.exceptions.service.CovidServiceException;

public class DistrictException extends CovidServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DistrictException() {
		super();
	}

	public DistrictException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public DistrictException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DistrictException(String arg0) {
		super(arg0);
	}

	public DistrictException(Throwable arg0) {
		super(arg0);
	}

}
