package com.brian.springboot.app.monolito.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@Table(name = "clientes")
public class Cliente  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = false)
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
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Column(name = "url_foto")
    @NotBlank
    private String urlFoto;

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    @NotNull
    private TipoIdentificacion tipoIdentificacion;
    @ManyToOne
    @JoinColumn(name = "id_ciudad")
    @NotNull
    private Ciudad ciudad;

}
