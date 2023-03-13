/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.aplicacion.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

/**
 *
 * @author ayosu
 */
@Entity
@Table(name="tblUsuarios")
public class Usuario {
    @Id
    @Column(name="Usuario_ID")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String nombreUsusario;
    private String nombreCompleto;
    @Transient //para que no aparesca en la bases de datos
    private boolean ambosnombres;
    public boolean  isAmbosNombres(){
        return !nombreCompleto.isEmpty()&&!nombreUsusario.isEmpty();
    }

    public String getNombreUsusario() {
        return nombreUsusario;
    }

    public void setNombreUsusario(String nombreUsusario) {
        this.nombreUsusario = nombreUsusario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

   @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombreUsusario=" + nombreUsusario + ", nombreCompleto=" + nombreCompleto + '}';
    }
    
 
  
    
    
    
    
}
 