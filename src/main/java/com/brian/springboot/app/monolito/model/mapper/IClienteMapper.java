package com.brian.springboot.app.monolito.model.mapper;

import com.brian.springboot.app.monolito.model.DTO.ClienteDTO;
import com.brian.springboot.app.monolito.model.entity.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface IClienteMapper {
    IClienteMapper INSTANCE = Mappers.getMapper(IClienteMapper.class);

    Cliente toEntity(ClienteDTO clienteDTO);

    ClienteDTO toDto(Cliente cliente);

    default List<ClienteDTO> toDtoList(List<Cliente> clienteList){
        if(clienteList == null){
            return new ArrayList<>();
        }
        return clienteList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
