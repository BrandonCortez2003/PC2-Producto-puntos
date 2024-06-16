package com.cibertec.ciber.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cibertec.ciber.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
    
}