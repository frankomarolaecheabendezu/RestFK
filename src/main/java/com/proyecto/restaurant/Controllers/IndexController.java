/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.restaurant.Controllers;

import com.proyecto.restaurant.Models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author frank
 */
@Controller
@RequestMapping("/app")
public class IndexController {
    //es get por default
    @GetMapping({"/index","/","/home"})
    public String Inicio(Model model){
        model.addAttribute("titulo","hola Spring Framework");
        return "index";
    }
   
    
    @GetMapping({"/perfil"})
    public String Detalle(Model model){
        Usuario usuario=new Usuario();
        usuario.setApellido("Olaechea Bendezú");
        usuario.setNombre("Frank Omar");
        model.addAttribute("usuario",usuario);
        return "perfil";
    }
    
    
}
