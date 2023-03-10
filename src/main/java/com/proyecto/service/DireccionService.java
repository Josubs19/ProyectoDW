package com.proyecto.service;

import com.proyecto.domain.Direccion;
import java.util.List;


public interface DireccionService {
    
    public List<Direccion> getDireccion();
    
    public Direccion getDireccion(Direccion direccion);
    
    public void save(Direccion direccion);
    
    public void delete(Direccion direccion);
    
}
