package com.mindtree.covid.dto;

import java.util.Date;

public class ResponseBody<T> {
	private Date responseDate;
	private Object response;
	private Object error;
	private boolean success;

	public ResponseBody( Object response, Object error, boolean success) {
		this.responseDate = new Date();
		this.response = response;
		this.error = error;
		this.success = success;
	}

	public Date getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}

	public Object getResponse() {
		return response;
	}

	public void setResponse(Object response) {
		this.response = response;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
		
}
