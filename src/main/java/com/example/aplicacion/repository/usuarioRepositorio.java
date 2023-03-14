/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.aplicacion.repository;

import com.example.aplicacion.Entity.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author ayosu
 */
public interface usuarioRepositorio extends CrudRepository<Usuario,Long> {
    
    
}
