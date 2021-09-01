package com.indigital.customer.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="client_entity")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ClientEntity  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6890081569871424383L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String surname;
	private LocalDate birthDate;
	private Integer age;
	
}
