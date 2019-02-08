package com.jboss.pojos;

import javax.persistence.*;

@Entity
@Table(name="birthdetails")
public class BirthDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="certificate_type")
	private String certificate_type;
	
	@Column(name="birthid")
	private String birthid;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="middlename")
	private String middlename;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="gender")
	private String 	gender;
	
	@Column(name="state")
	private String state;
	
	@Column(name="district")
	private String district;
	
	
	@Column(name="taluka")
	private String taluka;
	
	@Column(name="village")
	private String village;
	
	@Column(name="birthdate")
	private String birthdate;
	
	@Column(name="birthplace")
	private String birthplace;
	
	@Column(name="birthtime")
	private String birthtime;
	
	@Column(name="fathername")
	private String fathername;
	
	@Column(name="fathernationality")
	private String fathernationality;
	
	@Column(name="fadhaar")
	private String fadhaar;
	
	@Column(name="fage")
	private int fage;
	
	@Column(name="mothername")
	private String mothername;
	
	@Column(name="madhaar")
	private String madhaar;
	
	@Column(name="mage")
	private String mage;
	
	@Column(name="mothernationality")
	private String mothernationality;
	
	@Column(name="referedby")
	private String referedby;
	
	
	public BirthDetails() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCertificate_type() {
		return certificate_type;
	}


	public void setCertificate_type(String certificate_type) {
		this.certificate_type = certificate_type;
	}


	public String getBirthid() {
		return birthid;
	}


	public void setBirthid(String birthid) {
		this.birthid = birthid;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getMiddlename() {
		return middlename;
	}


	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getTaluka() {
		return taluka;
	}


	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}


	public String getVillage() {
		return village;
	}


	public void setVillage(String village) {
		this.village = village;
	}


	public String getBirthdate() {
		return birthdate;
	}


	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}


	public String getBirthplace() {
		return birthplace;
	}


	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}


	public String getBirthtime() {
		return birthtime;
	}


	public void setBirthtime(String birthtime) {
		this.birthtime = birthtime;
	}


	public String getFathername() {
		return fathername;
	}


	public void setFathername(String fathername) {
		this.fathername = fathername;
	}


	public String getFathernationality() {
		return fathernationality;
	}


	public void setFathernationality(String fathernationality) {
		this.fathernationality = fathernationality;
	}


	public String getFadhaar() {
		return fadhaar;
	}


	public void setFadhaar(String fadhaar) {
		this.fadhaar = fadhaar;
	}


	public int getFage() {
		return fage;
	}


	public void setFage(int fage) {
		this.fage = fage;
	}


	public String getMothername() {
		return mothername;
	}


	public void setMothername(String mothername) {
		this.mothername = mothername;
	}


	public String getMadhaar() {
		return madhaar;
	}


	public void setMadhaar(String madhaar) {
		this.madhaar = madhaar;
	}


	public String getMage() {
		return mage;
	}


	public void setMage(String mage) {
		this.mage = mage;
	}


	public String getMothernationality() {
		return mothernationality;
	}


	public void setMothernationality(String mothernationality) {
		this.mothernationality = mothernationality;
	}


	public String getReferedby() {
		return referedby;
	}


	public void setReferedby(String referedby) {
		this.referedby = referedby;
	}
	
	
	
	
}
