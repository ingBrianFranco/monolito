package com.brian.springboot.app.monolito.model.DAO;

import com.brian.springboot.app.monolito.model.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICiudadDAO extends JpaRepository<Ciudad, Long> {
}
