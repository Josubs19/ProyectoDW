package com.proyecto.dao;

import com.proyecto.domain.Carro;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarroDao extends JpaRepository<Carro,Long>{
    
}
