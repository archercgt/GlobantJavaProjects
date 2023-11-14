/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Spring.controladores;

import com.egg.Spring.entidades.Noticia;
import com.egg.Spring.excepciones.MiException;
import com.egg.Spring.servicios.NoticiaServicio;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Archer
 */
@Controller
@RequestMapping("/") //localhost:8080
public class PortalControlador {

    @Autowired
    private NoticiaServicio noticiaServicio;

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @GetMapping("/listar")
    public String listar(ModelMap modelo) {
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        // Sort the list in descending order based on the Alta attribute
        Collections.sort(noticias, Comparator.comparing(Noticia::getAlta).reversed());
        modelo.addAttribute("noticias", noticias);
        return "noticia_listar.html";
    }

    @GetMapping("/crear")
    public String crear() {
        return "noticia_form.html";
    }

    @GetMapping("/modificar")
    public String modificar(ModelMap modelo) {
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "noticia_modificar.html";
    }

    @GetMapping("/eliminar")
    public String eliminar(ModelMap modelo) {
        List<Noticia> noticias = noticiaServicio.listarNoticias();
        modelo.addAttribute("noticias", noticias);
        return "noticia_eliminar.html";
    }
    
    @GetMapping("/vista/{id}")
    public String vista(@PathVariable String id, ModelMap modelo){
        modelo.put("noticia", noticiaServicio.getOne(id));
        return "noticia_vista.html";
    }

    @PostMapping("/crear")
    public String registrar(@RequestParam String input_titulo, @RequestParam String input_descripcion, ModelMap modelo) {
        try {
            noticiaServicio.crearNoticia(input_titulo, input_descripcion);
            modelo.put("exito", "La noticia fue cargada correctamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_form.html";
        }
        return "index.html";
    }

    @PostMapping("/modificar")
    public String modificar(@RequestParam String id, @RequestParam String titulo, @RequestParam String descripcion, ModelMap modelo) {
        try {
            noticiaServicio.modificarNoticia(id, titulo, descripcion);
            modelo.put("exito", "La noticia fue modificada exitosamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_modificar.html";
        }
        return "index.html";
    }

    @PostMapping("/eliminar")
    public String eliminar(@RequestParam String id, ModelMap modelo) {
        try {
            noticiaServicio.eliminarNoticia(id);
            modelo.put("exito", "La noticia fue eliminada exitosamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_eliminar.html";
        }
        return "index.html";
    }

}
