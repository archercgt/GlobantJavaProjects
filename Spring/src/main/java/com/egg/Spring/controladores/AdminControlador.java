/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Spring.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Archer
 */
@Controller
@RequestMapping("/admin")
public class AdminControlador {
    
    @GetMapping("/dashboard")
    public String panelAdministrativo(){
        return "panel.html";
    }
}
