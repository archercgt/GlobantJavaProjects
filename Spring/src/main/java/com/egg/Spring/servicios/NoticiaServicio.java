/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Spring.servicios;

import com.egg.Spring.entidades.Noticia;
import com.egg.Spring.excepciones.MiException;
import com.egg.Spring.repositorios.NoticiaRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Archer
 */
@Service
public class NoticiaServicio {

    @Autowired
    private NoticiaRepositorio noticiaRepositorio;

    @Transactional
    public void crearNoticia(String titulo, String cuerpo) throws MiException {
        validar(titulo, cuerpo);
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setAlta(new Date());
        noticiaRepositorio.save(noticia);
    }

    @Transactional(readOnly = true)
    public List<Noticia> listarNoticias() {
        List<Noticia> noticias = new ArrayList();
        noticias = noticiaRepositorio.findAll();
        return noticias;
    }
    
    public Noticia getOne(String id){
        return noticiaRepositorio.getOne(id);
    }

    @Transactional
    public void modificarNoticia(String id, String titulo, String cuerpo) throws MiException {
        if (id.equals("Seleccionar Noticia")) {
            throw new MiException("Debe seleccionar una noticia");
        }
        validar(titulo, cuerpo);

        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Noticia noticia = noticiaRepositorio.findById(id).get();
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticiaRepositorio.save(noticia);
        }
    }

    @Transactional
    public void eliminarNoticia(String id) throws MiException {
        if (id.equals("Seleccionar Noticia")) {
            throw new MiException("Debe seleccionar una noticia");
        }

        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Noticia noticia = noticiaRepositorio.findById(id).get();
            noticiaRepositorio.delete(noticia);
        }
    }

    private void validar(String titulo, String cuerpo) throws MiException {
        if (titulo == null || titulo.isEmpty()) {
            throw new MiException("El título no puede ser nulo");
        }

        if (cuerpo == null || cuerpo.isEmpty()) {
            throw new MiException("La descripción no puede ser nula");
        }
    }
}
