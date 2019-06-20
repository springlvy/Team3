package com.jnu.teamproject.data;

import java.io.Serializable;

public class UserInfo implements Serializable{

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getDorm() {
		return dorm;
	}
	public void setDorm(String dorm) {
		this.dorm = dorm;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardPassword() {
		return cardPassword;
	}
	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}
	public String getOfficeAccount() {
		return officeAccount;
	}
	public void setOfficeAccount(String officeAccount) {
		this.officeAccount = officeAccount;
	}
	public String getOfficePassword() {
		return officePassword;
	}
	public void setOfficePassword(String officePassword) {
		this.officePassword = officePassword;
	}
	public String getDigitJnuAccount() {
		return digitJnuAccount;
	}
	public void setDigitJnuAccount(String digitJnuAccount) {
		this.digitJnuAccount = digitJnuAccount;
	}
	public String getDigitJnuPassword() {
		return digitJnuPassword;
	}
	public void setDigitJnuPassword(String digitJnuPassword) {
		this.digitJnuPassword = digitJnuPassword;
	}
	public String getForumAccount() {
		return forumAccount;
	}
	public void setForumAccount(String forumAccount) {
		this.forumAccount = forumAccount;
	}
	public String getForumPassword() {
		return forumPassword;
	}
	public void setForumPassword(String forumPassword) {
		this.forumPassword = forumPassword;
	}
	
	private String name;
	private String sex;
	private String number;
	private String institution;//ѧԺ
	private String major;
	private String dorm;
	private String cardNumber;
	private String cardPassword;
	private String officeAccount;
	private String officePassword;
	private String digitJnuAccount;
	private String digitJnuPassword;
	private String forumAccount;
	private String forumPassword;
	
}
