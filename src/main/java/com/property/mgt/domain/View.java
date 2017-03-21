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
public class View {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long viewId;
	
	private Date viewDate;
	@JoinColumn(name = "client_id", referencedColumnName = "id")
    @ManyToOne
	private Client client;
	@JoinColumn(name = "unit_id", referencedColumnName = "id")
    @ManyToOne
	private Unit unit;
	private String comment;
	
	public View(){
		
	}

	public long getViewId() {
		return viewId;
	}

	public void setViewId(long viewId) {
		this.viewId = viewId;
	}

	public Date getViewDate() {
		return viewDate;
	}

	public void setViewDate(Date viewDate) {
		this.viewDate = viewDate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
	
	
}
