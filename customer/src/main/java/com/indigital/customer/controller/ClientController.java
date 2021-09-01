package com.indigital.customer.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.indigital.customer.dto.AgeDevAvg;
import com.indigital.customer.dto.ClientDto;
import com.indigital.customer.dto.ClientDtoWithDateDie;
import com.indigital.customer.service.ClientService;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ClientController {

	private final ClientService clientService;

	@ApiOperation(value = "Crea un cliente, le asigna la edad segun su fecha de nacimiento")
	@PostMapping("/creacliente")
	public ResponseEntity<Void> createUser(@Valid @RequestBody ClientDto clientDto) {
		clientService.createClient(clientDto);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	@ApiOperation(value = "Calcula el promedio de edad de todos los clientes y su variacion standar")
	@GetMapping("/kpideclientes")
	public ResponseEntity<AgeDevAvg> getClients() {
		return ResponseEntity.status(HttpStatus.OK).body(clientService.ageDevAvg());
	}
	@ApiOperation(value = "Lista sus clientes, con una fecha estimativa de su muerte")
	@GetMapping("/listclientes")
	public ResponseEntity<List<ClientDtoWithDateDie>> getClientsss() {
		return ResponseEntity.status(HttpStatus.OK).body(clientService.findAllClient());
	}

}
