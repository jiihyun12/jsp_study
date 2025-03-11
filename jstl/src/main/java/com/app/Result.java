package com.app;

/**
 * 
 */
public class Result {
//	어떻게 보낼래
	private boolean idRedirect;
//	어디로 보낼래
	private String path;
	
	public Result() {;}

	public Result(boolean idRedirect, String path) {
		super();
		this.idRedirect = idRedirect;
		this.path = path;
	}

	@Override
	public String toString() {
		return "Result [idRedirect=" + idRedirect + ", path=" + path + "]";
	}

	public boolean isIdRedirect() {
		return idRedirect;
	}

	public void setIdRedirect(boolean idRedirect) {
		this.idRedirect = idRedirect;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	
}
