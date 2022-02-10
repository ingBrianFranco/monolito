package com.brian.springboot.app.monolito.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "tipos_id")
public class TipoIdentificacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo", nullable = false)
    private Long idTipo;

    private String descripcion;
    private String siglas;

}
