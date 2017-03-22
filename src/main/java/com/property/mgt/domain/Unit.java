package com.property.mgt.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Unit {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long unitId;
	private String unitNumber;
	private String size;
	private String description;
	private String unitType;
	private String status;
	private int rooms;
	@OneToMany(mappedBy = "unit", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<View> viewList = new ArrayList<>();
	@OneToMany(mappedBy = "unit", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Lease> leaseList = new ArrayList<>();
	
	@OneToMany(mappedBy = "unit", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Payment> paymentsList = new ArrayList<>();
	
	@OneToMany(mappedBy = "unit", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Payment> preferenceList;
	@ManyToOne
	@JoinColumn(name = "property_id", referencedColumnName = "id")
	private Property property;
	
	public Unit(){
		
	}

	public long getUnitId() {
		return unitId;
	}

	public void setUnitId(long unitId) {
		this.unitId = unitId;
	}

	public String getUnitNumber() {
		return unitNumber;
	}

	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<View> getViewList() {
		return viewList;
	}

	public void setViewList(List<View> viewList) {
		this.viewList = viewList;
	}

	public List<Payment> getPaymentsList() {
		return paymentsList;
	}

	public void setPaymentsList(List<Payment> paymentsList) {
		this.paymentsList = paymentsList;
	}

	public List<Payment> getPreferenceList() {
		return preferenceList;
	}

	public void setPreferenceList(List<Payment> preferenceList) {
		this.preferenceList = preferenceList;
	}

	public String getUnitType() {
		return unitType;
	}

	public void setUnitType(String unitType) {
		this.unitType = unitType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

	public List<Lease> getLeaseList() {
		return leaseList;
	}

	public void setLeaseList(List<Lease> leaseList) {
		this.leaseList = leaseList;
	}
	
	
	
}
