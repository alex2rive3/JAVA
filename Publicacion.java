/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alex
 */
public class Publicacion {
    public String titulo;
    public Date fechaEdicion;
    public String editorial;
    public ArrayList<String> autores = new ArrayList<>();

    public Publicacion(String titulo, Date fechaEdicion, String editorial) {
        this.titulo = titulo;
        this.fechaEdicion = fechaEdicion;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Date fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public ArrayList<String> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<String> autores) {
        this.autores = autores;
    }

    
}
