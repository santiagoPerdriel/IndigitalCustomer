package com.indigital.customer.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class ClientDto implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7874755274503014989L;
	
	private String name;
	private String surname;
	private LocalDate birthDate;
	

}
