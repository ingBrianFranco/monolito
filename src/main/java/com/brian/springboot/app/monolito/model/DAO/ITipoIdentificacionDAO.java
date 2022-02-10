package com.brian.springboot.app.monolito.model.DAO;

import com.brian.springboot.app.monolito.model.entity.TipoIdentificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoIdentificacionDAO extends JpaRepository<TipoIdentificacion, Long> {
}
