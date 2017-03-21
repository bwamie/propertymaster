package com.property.mgt.domain2;

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
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long businessCLientId;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	private Business business;
	
	public BusinessClient(){
		
	}
}
