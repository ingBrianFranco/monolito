package com.brian.springboot.app.monolito.controllers;

import com.brian.springboot.app.monolito.model.DAO.ClienteDAOImpl;
import com.brian.springboot.app.monolito.model.DTO.ClienteDTO;
import com.brian.springboot.app.monolito.model.entity.Cliente;
import com.brian.springboot.app.monolito.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    //@Autowired
    //private ClienteDAOImpl clienteDAO;

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listar")
    private ResponseEntity<List<ClienteDTO>> getAllClientes(){
        return ResponseEntity.ok(clienteService.findAll());
    }

    @PostMapping("/buscar")
    private ResponseEntity<Optional<ClienteDTO>> findById(@RequestBody Long id){
        return ResponseEntity.ok(clienteService.findById(id));
    }

    /**
     * Pendiente por implementar
     * @param documento
     * @return
     */
    @PostMapping("/buscarDocumento")
    private ResponseEntity<Cliente> findByDocument(@RequestBody Long documento){
        //return ResponseEntity.ok(clienteDAO.getById(documento));
        return null;
    }

    @PostMapping("/guardar")
    private ResponseEntity saveCliente(@RequestBody @Valid Cliente cliente, BindingResult result){
        try {
            if(result.hasErrors()){
                Map<String, String> errores = new HashMap<>();
                result.getFieldErrors().forEach(error ->{
                    errores.put(error.getField(), error.getDefaultMessage());
                });
                return ResponseEntity.status(422).body(errores);
            }else {
                ClienteDTO cliente1 = clienteDAO.save(cliente);
                return ResponseEntity.created(new URI("/cliente/" + cliente1.getIdCliente())).body(cliente1);
            }
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PutMapping("/actualizar")
    private ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente){
        try {
            System.out.println(findById(cliente.getIdCliente()));
            if(findById(cliente.getIdCliente()).hasBody()){
                Cliente cliente1 = clienteDAO.save(cliente);
                return ResponseEntity.ok().body(cliente1);
            }else{
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("/eliminar/{id}")
    private ResponseEntity<Boolean> deleteCliente(@PathVariable ("id") Long id){
        try {
            clienteDAO.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
