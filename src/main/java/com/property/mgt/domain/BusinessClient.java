package com.property.mgt.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BusinessClient extends Client {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name="id")
	private long businessCLientId;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private Business business;
	
	public BusinessClient(){
		
	}

	public long getBusinessCLientId() {
		return businessCLientId;
	}

	public void setBusinessCLientId(long businessCLientId) {
		this.businessCLientId = businessCLientId;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}
	
	
}
