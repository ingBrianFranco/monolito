package com.brian.springboot.app.monolito.model.DTO;

import com.brian.springboot.app.monolito.model.entity.Ciudad;
import com.brian.springboot.app.monolito.model.entity.TipoIdentificacion;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class ClienteDTO {

    private Long idCliente;

    @NotBlank
    private String nombres;
    @NotBlank
    private String apellidos;
    @NotNull
    @Min(18)
    @Max(130)
    private int edad;
    @NotNull
    @Min(10000000)
    @Max(999999999)
    private Long documento;
    @NotNull
    private Date fechaNacimiento;
    @Column(name = "url_foto")
    @NotBlank
    private String urlFoto;

    @NotNull
    private TipoIdentificacion tipoIdentificacion;
    @NotNull
    private Ciudad ciudad;
}
