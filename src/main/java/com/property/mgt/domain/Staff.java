package com.property.mgt.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Staff {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long staffId;
	private String position;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL )
	private Person person;
	
	@OneToMany(mappedBy = "property", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<PropertyStaff> propertyStaffList;
	
	public Staff(){
		
	}
	
	public long getStaffId() {
		return staffId;
	}
	public void setStaffId(long staffId) {
		this.staffId = staffId;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<PropertyStaff> getPropertyStaffList() {
		return propertyStaffList;
	}

	public void setPropertyStaffList(List<PropertyStaff> propertyStaffList) {
		this.propertyStaffList = propertyStaffList;
	}

	
	
}
