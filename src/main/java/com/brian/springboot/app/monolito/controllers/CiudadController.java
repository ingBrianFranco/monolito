package com.brian.springboot.app.monolito.controllers;

import com.brian.springboot.app.monolito.model.DAO.CiudadDAOImpl;
import com.brian.springboot.app.monolito.model.DAO.ClienteDAOImpl;
import com.brian.springboot.app.monolito.model.entity.Ciudad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ciudad")
public class CiudadController {


    @Autowired
    private CiudadDAOImpl ciudadDAO;

    @GetMapping("/listar")
    private ResponseEntity<List<Ciudad>> getAllCiudades(){
        return ResponseEntity.ok(ciudadDAO.findAll());
    }
}
