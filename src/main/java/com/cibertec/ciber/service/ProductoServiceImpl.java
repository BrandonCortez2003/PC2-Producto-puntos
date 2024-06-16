package com.cibertec.ciber.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.ciber.entity.Producto;
import com.cibertec.ciber.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private ProductoRepository repository;

    @Override
    public List<Producto> listaTodos() {
       return repository.findAll();
    }

    @Override
    public Optional<Producto> obtenerProductoPorId(int id) {
        return repository.findById(id);
    }

    @Override
    public Producto agregarActualizarProducto(Producto producto) {
        return repository.save(producto) ;
    }

    @Override
    public void eliminarProducto(int id) {
        repository.deleteById(id);
    }
    
}
