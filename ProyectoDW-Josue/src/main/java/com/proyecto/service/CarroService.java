package com.proyecto.service;

import com.proyecto.domain.Carro;
import java.util.List;

public interface CarroService {
    
    public List<Carro> getCarro();
    
    public Carro getCarro(Carro carro);
    
    public void save(Carro carro);
    
    public void delete(Carro carro);
    
}
