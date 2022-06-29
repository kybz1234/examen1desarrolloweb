/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.entity;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Kybz
 */

@Entity
@Data
@Table(name="concierto")



public class Concierto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long idconcierto;
    private String artista;
    private int costo;
    private String fecha;
    private int capacidad;
    private String lugar;
    

    public Concierto() {
    }

    
    public Concierto(String artista, int costo, String fecha, int capacidad, String lugar) {
        this.artista = artista;
        this.costo = costo;
        this.fecha = fecha;
        this.capacidad = capacidad;
        this.lugar = lugar;
    }
    
    
    
}
