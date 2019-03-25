package com.onlineclassroom.account.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_Tab")
public class User {
      
       @Id
 	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   private int userId;
	   private String userName;
	   private String userPic;
	   private String userEmail;
	   private String sex;
	   private String userPhone;
	 //  private Address address;
     
	public User() {
		super();
	}
	
	public User(Integer userId) {
		super();
		this.userId = userId;
	}
   
	public User(Integer userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
    
	public User(Integer userId, String userName, String userPic) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPic = userPic;
	}
    
	public User(Integer userId, String userName, String userPic, String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPic = userPic;
		this.userEmail = userEmail;
	}
     
	public User(Integer userId, String userName, String userPic, String userEmail, String sex) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPic = userPic;
		this.userEmail = userEmail;
		this.sex = sex;
	}
    
	public User(Integer userId, String userName, String userPic, String userEmail, String sex, String userPhone) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPic = userPic;
		this.userEmail = userEmail;
		this.sex = sex;
		this.userPhone = userPhone;
	}

	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPic() {
		return userPic;
	}
	public void setUserPic(String userPic) {
		this.userPic = userPic;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPic=" + userPic + ", userEmail=" + userEmail
				+ ", sex=" + sex + ", userPhone=" + userPhone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPhone == null) ? 0 : userPhone.hashCode());
		result = prime * result + ((userPic == null) ? 0 : userPic.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPhone == null) {
			if (other.userPhone != null)
				return false;
		} else if (!userPhone.equals(other.userPhone))
			return false;
		if (userPic == null) {
			if (other.userPic != null)
				return false;
		} else if (!userPic.equals(other.userPic))
			return false;
		return true;
	}

	
	
}
