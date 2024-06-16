package com.cibertec.ciber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.ciber.entity.Producto;
import com.cibertec.ciber.service.ProductoService;

@RestController
@RequestMapping("/url/producto")
public class ProductoController {
    
    @Autowired
     private ProductoService service;
    
    @GetMapping("/listarProductoTodos")
    public List<Producto> listaTodos(){
         return service.listaTodos();
    }
}
