/**
 * 
 */
package com.su.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = -5290198995172316155L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_registration_id")
	private Integer userRegId;
	
	@Column(name = "created_dt")
	private Date createdDt;

	@Column(name = "user_name")
	private String username;

	public Integer getUserRegId() {
		return userRegId;
	}

	public void setUserRegId(Integer userRegId) {
		this.userRegId = userRegId;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [userRegId=" + userRegId + ", createdDt=" + createdDt + ", username=" + username + "]";
	}



	

}
