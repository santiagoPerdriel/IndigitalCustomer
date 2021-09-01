package com.indigital.customer.service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.stereotype.Service;

import com.indigital.customer.dto.AgeDevAvg;
import com.indigital.customer.dto.ClientDto;
import com.indigital.customer.dto.ClientDtoWithDateDie;
import com.indigital.customer.repository.ClientRepository;
import com.indigital.customer.service.mapper.ClientMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientService {

	private final ClientRepository clientRepository;
	private static final  ClientMapper mapper = ClientMapper.INSTANCE;

	public void createClient(ClientDto clientDto) {
		var client = mapper.dtoToEntity(clientDto);
		client.setAge(calculateAge(clientDto.getBirthDate()));
		clientRepository.save(client);
	}

	private static Integer calculateAge(LocalDate birthDate) {
		var now = LocalDate.now();
		var calculateperid = Period.between(birthDate, now);
		return calculateperid.getYears();
	}

	public AgeDevAvg ageDevAvg() {
		return new AgeDevAvg(clientRepository.stdDev(), clientRepository.avg());
	}

	public List<ClientDtoWithDateDie> findAllClient() {

		return mapper.dtoToDtos(clientRepository.findAll());

	}

}
