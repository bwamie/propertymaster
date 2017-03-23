package com.property.mgt.exception;

import com.property.mgt.domain.Property;

public class PropertyPhotoUploadException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Property property;

	public PropertyPhotoUploadException(String msg, Property property){
		super(msg);
		this.property = property;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}
}
