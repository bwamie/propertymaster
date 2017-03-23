package com.property.mgt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private long contactId;
	
	@NotEmpty
	@Email(message = "{Validation.Contact.Email}")
	private String email;
	
	private String phone;
	
	@NotNull
	@Range(min = 100, max = 999, message = "{Validation.Contact.AreaCode}")
	private Integer areaCode;
	
	@NotNull
	@Range(min = 100, max = 999, message = "{Validation.Contact.prefix}")
	private Integer prefix;
	
	@NotNull
	@Range(min = 1000, max = 9999, message = "{Validation.Contact.number}")
	private Integer number;
	
	@NotEmpty
	@Size(min = 2, max = 15, message = "{Validation.Contact.city}")
	private String city;
	
	@NotEmpty
	@Size(min = 2, max = 2, message = "{Validation.Contact.state}")
	private String state;
	
	@NotNull
	@Range(min = 10000, max = 99999, message = "{Validation.Contact.zipcode}")
	private Integer zipCode;
	
	public Contact(){
		
	}
	
	public long getContactId() {
		return contactId;
	}
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZipCode() {
		return zipCode;
	}
	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(Integer areaCode) {
		this.areaCode = areaCode;
	}

	public Integer getPrefix() {
		return prefix;
	}

	public void setPrefix(Integer prefix) {
		this.prefix = prefix;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	
}
