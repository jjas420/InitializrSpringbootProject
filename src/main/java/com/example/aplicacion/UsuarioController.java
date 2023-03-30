/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aplicacion;

import com.example.aplicacion.Entity.Usuario;
import com.example.aplicacion.repository.usuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ayosu
 */
@Controller
public class UsuarioController {
    @Autowired
    usuarioRepositorio repositorio;
    @GetMapping
    public String Index(Model modelo,Usuario usuario){
        modelo.addAttribute("usuario",new Usuario());
        modelo.addAttribute("tblUsuarios", repositorio.findAll());
        
        
        return "registro";
    }
    
    
}
