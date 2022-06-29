/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ITicket.controller;


import com.ITicket.entity.Concierto;
import com.ITicket.service.IConciertoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Kybz
 */

@Controller
@Slf4j
public class ConciertoController {
    
    @Autowired
    private IConciertoService conciertoService;
    
    
    @GetMapping("/")
    public String inicio(Model model){
        
        var conciertos = conciertoService.getConcierto();
        model.addAttribute("conciertos", conciertos);
        
        return "index";
        
    }
    
    @GetMapping("/crearEvento")
    public String crearEvento (Concierto concierto){
        
        return "crearEvento";
        
    }
    
    @PostMapping("/guardarEvento")
    public String guardarEvento (Concierto concierto){
        
        conciertoService.save(concierto);
        return"redirect:/";
        
    }
}
