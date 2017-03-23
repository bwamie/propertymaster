package com.property.mgt.exception;

import com.property.mgt.domain.Property;
import com.property.mgt.domain.Unit;

public class UnitPhotoUploadException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Unit unit;

	public UnitPhotoUploadException(String msg, Unit unit){
		super(msg);
		this.unit = unit;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	
}
