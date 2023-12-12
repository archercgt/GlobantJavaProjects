/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Spring.controladores;

import com.egg.Spring.entidades.Noticia;
import com.egg.Spring.entidades.Periodista;
import com.egg.Spring.entidades.Usuario;
import com.egg.Spring.excepciones.MiException;
import com.egg.Spring.servicios.NoticiaServicio;
import com.egg.Spring.servicios.UsuarioServicio;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @Autowired
    private UsuarioServicio usuarioServicio;

    @GetMapping("/")
    public String index() {
        return "index.html";
    }

    @PreAuthorize("hasAnyRole('ROLE_USUARIO', 'ROLE_PERIODISTA', 'ROLE_ADMIN')")
    @GetMapping("/inicio")
    public String inicio(HttpSession session) {
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");

        if (logueado.getRol().toString().equals("ADMIN")) {
            return "redirect:/admin/dashboard";
        }
        return "index_noticias.html";
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
    public String vista(@PathVariable String id, ModelMap modelo) {
        modelo.put("noticia", noticiaServicio.getOne(id));
        return "noticia_vista.html";
    }

    @GetMapping("/registrar")
    public String registrar() {
        return "registro.html";
    }

    @PostMapping("/registrar")
    public String login(@RequestParam String nombre, @RequestParam String email,
            @RequestParam String password, @RequestParam String password2, ModelMap modelo) {
        try {
            usuarioServicio.registrar(nombre, email, password, password2);
            modelo.put("exito", "El usuario fue creado correctamente");
            return "index.html";
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            modelo.put("nombre", nombre);
            modelo.put("email", email);
            return "registro.html";
        }
    }

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String error, ModelMap modelo) {
        if (error != null) {
            modelo.put("error", "Usuario o contraseña invalidos!");
        }
        return "login.html";
    }

    @PostMapping("/crear")
    public String registrar(@RequestParam String input_titulo, @RequestParam String input_descripcion, HttpSession session, ModelMap modelo) {
        try {
            Usuario logueado = (Usuario) session.getAttribute("usuariosession");
            noticiaServicio.crearNoticia(input_titulo, input_descripcion,logueado);
            modelo.put("exito", "La noticia fue cargada correctamente");
        } catch (MiException ex) {
            modelo.put("error", ex.getMessage());
            return "noticia_form.html";
        }
        return "index_noticias.html";
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
