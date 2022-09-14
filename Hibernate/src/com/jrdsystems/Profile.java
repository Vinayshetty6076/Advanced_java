package com.jrdsystems;

import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Profile")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Profile 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "P_id")
	private int id;
	
	@Column(name = "Name", length = 50)
	private String name;
	
	@Column(name = "Mobile", length = 10)
	private long mobile;
	
	@Column(name = "Email", length = 100)
	private String email;
	
	private Address address;
	
	@Transient
	private int xyz;
	
	@Lob
	@Column(name = "Pic")
	private byte[] image;
	
	@Column(name = "Joining_Date")
	@Temporal(TemporalType.DATE)
	private Date date;

	public Profile() {
		super();
	}

	public Profile(int id, String name, long mobile, String email, Address address, int xyz, byte[] image,
			Date date) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.xyz = xyz;
		this.image = image;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getXyz() {
		return xyz;
	}

	public void setXyz(int xyz) {
		this.xyz = xyz;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", address="
				+ address +", date=" + date;
	}
	
	
}