package com.indigital.customer.service.mapper;

import java.util.List;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.indigital.customer.dto.ClientDto;
import com.indigital.customer.dto.ClientDtoWithDateDie;
import com.indigital.customer.model.ClientEntity;



@Mapper
public interface ClientMapper {

	ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

	@InheritConfiguration
	ClientEntity dtoToEntity(ClientDto clientDto);
	
	ClientDtoWithDateDie dtoToDto(ClientEntity clientEntity);
	
	List<ClientDtoWithDateDie> dtoToDtos(List<ClientEntity> clientEntities);

}
