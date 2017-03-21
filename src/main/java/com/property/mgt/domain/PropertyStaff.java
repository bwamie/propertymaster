package com.property.mgt.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PropertyStaff {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long propertyStateId;
	private Date startDate;
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name = "staff_id", referencedColumnName = "id")
	private Staff staff;
	
	@ManyToOne
	@JoinColumn(name = "property_id", referencedColumnName = "id")
	private Property property;
	
	public long getPropertyStateId() {
		return propertyStateId;
	}

	public void setPropertyStateId(long propertyStateId) {
		this.propertyStateId = propertyStateId;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}
	
	public PropertyStaff(){
		
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	
}
