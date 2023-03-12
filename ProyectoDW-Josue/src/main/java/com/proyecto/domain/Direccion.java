package com.proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="direccion")


public class Direccion implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDireccion;
    
    private String provincia;
    private String canton;
    private String calle1;
    private String calle2;
    
    public Direccion(){
        
    }

    public Direccion(String provincia, String canton, String calle1, String calle2) {
        this.provincia = provincia;
        this.canton = canton;
        this.calle1 = calle1;
        this.calle2 = calle2;
    }

    
}
