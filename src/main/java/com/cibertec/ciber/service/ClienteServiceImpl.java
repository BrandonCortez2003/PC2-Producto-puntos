package com.cibertec.ciber.service;

import java.util.List;

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
    
}