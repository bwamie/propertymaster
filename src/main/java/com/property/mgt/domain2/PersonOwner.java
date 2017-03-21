package com.property.mgt.domain2;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class PersonOwner extends Owner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long personOwnerId;
	
	@OneToOne(fetch=FetchType.EAGER ,cascade=CascadeType.ALL)
	private Person person;
	
	public PersonOwner(){
		
	}

	public long getPersonOwnerId() {
		return personOwnerId;
	}

	public void setPersonOwnerId(long personOwnerId) {
		this.personOwnerId = personOwnerId;
	}
	
	

}
