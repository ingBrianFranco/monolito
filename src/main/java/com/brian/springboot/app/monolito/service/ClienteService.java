package com.brian.springboot.app.monolito.service;

import com.brian.springboot.app.monolito.model.DAO.ClienteDAOImpl;
import com.brian.springboot.app.monolito.model.DTO.ClienteDTO;
import com.brian.springboot.app.monolito.model.entity.Cliente;
import com.brian.springboot.app.monolito.model.mapper.IClienteMapperImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteDAOImpl clienteDAO;

    @Autowired
    private IClienteMapperImpl clienteMapper;

    public List<ClienteDTO> findAll() {
        List<Cliente> clientesEntity = clienteDAO.findAll();
        List<ClienteDTO> clientesDTO = clienteMapper.toDtoList(clientesEntity);
        return clientesDTO;
    }

    public ClienteDTO findById(Long aLong){
        Optional<Cliente> clienteEntity = clienteDAO.findById(aLong);
        if(clienteEntity.isPresent()){
            ClienteDTO clienteDTO = clienteMapper.toDto(clienteEntity.get());
            return clienteDTO;
        }else{
            return null;
        }
    }
}
