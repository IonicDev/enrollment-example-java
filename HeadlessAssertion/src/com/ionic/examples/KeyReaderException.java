/*
 * (c) 2017 Ionic Security Inc.
 * By using this code, I agree to the included License for Ionic Resources
 * and the Privacy Policy (https://www.ionic.com/privacy-notice/).
 */

package com.ionic.examples;

/**
* This is an exception to throw when the key reader can't properly read the key.
* This is only used in the File reader which is not used in the current implementation (only for test and 
* development)
*/
public class KeyReaderException extends Exception {

	
	
	private static final long serialVersionUID = 1L;
	   public KeyReaderException() {
	   
	    }

	    public KeyReaderException(String message) {
	        super(message);
	    }

	    public KeyReaderException(Throwable cause) {
	        super(cause);
	    }

	    public KeyReaderException(String message, Throwable cause) {
	        super(message, cause);
	    }
}
