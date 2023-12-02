/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.egg.Rest.entidades;

import java.util.Date;

/**
 *
 * @author Archer
 */
public class OrdenRequest {
    private String id;
    private Date fecha;

    public OrdenRequest() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "OrdenRequest{" + "id=" + id + ", fecha=" + fecha + '}';
    }

}
