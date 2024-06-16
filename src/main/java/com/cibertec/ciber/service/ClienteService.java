package com.cibertec.ciber.service;

import java.util.List;
import java.util.Optional;

import com.cibertec.ciber.entity.Cliente;

public interface ClienteService {
    
   //métodos para el CRUD cliente
   public abstract List<Cliente> listaTodos();
   public abstract Optional<Cliente> obtenerClientePorId(int id);
   public abstract Cliente  agregarActualizarCliente(Cliente cliente);
   public abstract void eliminarCliente(int id);
   

}