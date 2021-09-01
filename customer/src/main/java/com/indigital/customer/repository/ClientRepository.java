/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indigital.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.indigital.customer.dto.AgeDevAvg;
import com.indigital.customer.model.ClientEntity;

public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
	
	@Query("SELECT AVG(c.age) FROM ClientEntity c")
	Double avg();

	@Query(value ="SELECT stddev(c.age) FROM client_entity c", nativeQuery = true)
	Double stdDev();
	
	
	
	
}
