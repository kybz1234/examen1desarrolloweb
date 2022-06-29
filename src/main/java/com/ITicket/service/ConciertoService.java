/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.service;

import com.ITicket.entity.Concierto;
import com.ITicket.repository.ConciertoRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Kybz
 */

@Service

public class ConciertoService implements IConciertoService{
    
    @Autowired
    private ConciertoRepository conciertoRepository;

    @Override
    public List<Concierto> getConcierto() {
        return (List<Concierto>) conciertoRepository.findAll();
        
    }

    @Override
    public void save(Concierto concierto) {
        conciertoRepository.save(concierto);
    }

    @Override
    public void delete(Concierto concierto) {
        conciertoRepository.delete(concierto);
    }

    @Override
    public Concierto getConcierto(Concierto concierto) {
        return conciertoRepository.findById(concierto.getIdconcierto()).orElse(null);
    }
    
    
    
}
