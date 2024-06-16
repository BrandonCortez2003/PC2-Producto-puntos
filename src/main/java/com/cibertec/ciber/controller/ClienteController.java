package com.cibertec.ciber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.ciber.entity.Cliente;
import com.cibertec.ciber.service.ClienteService;

@RestController
@RequestMapping("/url/cliente")
public class ClienteController {
    
    @Autowired
     private ClienteService service;
    
    @GetMapping("/listarClienteTodos")
    public List<Cliente> listaTodos(){
         return service.listaTodos();
    }

}