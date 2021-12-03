package com.grupo3.pets_ms.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Pets {

    @Id
    private String id;
    private String imgBin64;
    private String descripcion;
    private Date fecha;
    private String ciudad;
    private int telefono;

    public Pets(String id, String imgBin64, String descripcion, Date fecha, String ciudad, int telefono) {
        this.id = id;
        this.imgBin64 = imgBin64;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImgBin64() {
        return imgBin64;
    }

    public void setImgBin64(String imgBin64) {
        this.imgBin64 = imgBin64;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
