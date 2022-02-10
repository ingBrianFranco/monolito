package com.brian.springboot.app.monolito.model.DAO;

import com.brian.springboot.app.monolito.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteDAO extends JpaRepository<Cliente, Long> {
}
