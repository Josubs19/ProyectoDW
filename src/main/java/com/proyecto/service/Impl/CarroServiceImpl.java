package com.proyecto.service.Impl;

import com.proyecto.dao.CarroDao;
import com.proyecto.domain.Carro;
import com.proyecto.service.CarroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarroServiceImpl implements CarroService{
    
    @Autowired
    private CarroDao carroDao;

    @Override
    @Transactional(readOnly = true)
    public List<Carro> getCarro() {
        return carroDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Carro getCarro(Carro carro) {
        return carroDao.findById(carro.getIdCarro()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Carro carro) {
        carroDao.save(carro);
    }

    @Override
    public void delete(Carro carro) {
        carroDao.delete(carro);
    }
    
}
