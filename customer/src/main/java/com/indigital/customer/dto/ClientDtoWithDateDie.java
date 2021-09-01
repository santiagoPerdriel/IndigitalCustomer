package com.indigital.customer.dto;

import java.io.Serializable;
import java.time.LocalDate;


public class ClientDtoWithDateDie implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7874755274503014989L;
	
	private String name;
	private String surname;
	private LocalDate birthDate;
	private Integer age;
	private LocalDate dieDate=this.birthDate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		
		this.birthDate = birthDate;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
		this.dieDate = birthDate.plusYears(90);
	}
	public LocalDate getDieDate() {
		return dieDate;
	}
	public void setDieDate(LocalDate dieDate) {
		this.dieDate = dieDate;
	}



	

	
	
	
	
	
	

}
