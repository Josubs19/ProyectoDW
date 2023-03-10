package com.proyecto.dao;

import com.proyecto.domain.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionDao extends JpaRepository<Direccion,Long>{
    
}
