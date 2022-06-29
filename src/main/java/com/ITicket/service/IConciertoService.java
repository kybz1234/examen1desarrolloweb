/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.service;

import com.ITicket.entity.Concierto;
import java.util.List;

/**
 *
 * @author Kybz
 */
public interface IConciertoService {
    
    public List<Concierto> getConcierto();
    
    public void save(Concierto concierto);
    
    public void delete(Concierto concierto);
    
    public Concierto getConcierto(Concierto concierto);
    
}
