package com.proyecto.service.Impl;


import com.proyecto.dao.DireccionDao;
import com.proyecto.domain.Direccion;
import com.proyecto.service.DireccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DireccionServiceImpl implements DireccionService{
 @Autowired
    private DireccionDao direccionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Direccion> getDireccion() {
        return direccionDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Direccion getDireccion(Direccion direccion) {
        return direccionDao.findById(direccion.getIdDireccion()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Direccion direccion) {
        direccionDao.save(direccion);
    }

    @Override
    public void delete(Direccion direccion) {
        direccionDao.delete(direccion);
    }
    

    
}
