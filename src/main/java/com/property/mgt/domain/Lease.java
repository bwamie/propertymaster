package com.property.mgt.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Lease {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long leadId;
	
	private Date startDate;
	private Date endDate;
	private double monthlyRate;
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL) 
	private Client client;
	
	public long getLeadId() {
		return leadId;
	}
	public void setLeadId(long leadId) {
		this.leadId = leadId;
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
	public double getMonthlyRate() {
		return monthlyRate;
	}
	public void setMonthlyRate(double monthlyRate) {
		this.monthlyRate = monthlyRate;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
}
