package com.cibertec.ciber.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.ciber.entity.Cliente;
import com.cibertec.ciber.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> listaTodos() {
        return repository.findAll();
    }

    @Override
    public Cliente agregarActualizarCliente(Cliente cliente) {
        return repository.save(cliente) ;
    }

    @Override
    public void eliminarCliente(int id) {
       repository.deleteById(id);
    }

    @Override
    public Optional<Cliente> obtenerClientePorId(int id) {
        return repository.findById(id);
    }
}