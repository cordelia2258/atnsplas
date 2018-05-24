package com.atns.plas.common.exception;

import com.atns.plas.common.util.Constants;

public class PlasException extends RuntimeException{
	private static final long serialVersionUID = -7096751019391299814L;
	
	private String code;
    private String message;
    
    public PlasException(String strCode, String strMessage){
        this.code= strCode;
        this.message = strMessage;
    }
    
    public PlasException(String strMessage){
        this.code= Constants.FAIL;
        this.message = strMessage;
    }
    
    public String toString() {
        return "PlasException [code=" + code + ", message=" + message + "]";
    } 
}
