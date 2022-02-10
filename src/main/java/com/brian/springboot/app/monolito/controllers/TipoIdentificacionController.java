package com.brian.springboot.app.monolito.controllers;

import com.brian.springboot.app.monolito.model.DAO.TipoIdentificacionDAOImpl;
import com.brian.springboot.app.monolito.model.entity.Ciudad;
import com.brian.springboot.app.monolito.model.entity.TipoIdentificacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipoid")
public class TipoIdentificacionController {

    @Autowired
    private TipoIdentificacionDAOImpl tipoIdentificacionDAO;

    @GetMapping("/listar")
    private ResponseEntity<List<TipoIdentificacion>> getAllTiposId(){
        return ResponseEntity.ok(tipoIdentificacionDAO.findAll());
    }
}
