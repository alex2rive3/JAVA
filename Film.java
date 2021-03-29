/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Ruben
 */
public class Film {
    public String titulo;
    public String creador;
    public String genero;
    public int duracion;
    public short año;
    public boolean visto;    

    public Film(String titulo, String creador, String genero, int duaracion, short año, boolean visto) {
        super();
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.duracion = duaracion;
        this.año = año;
        this.visto = visto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuaracion() {
        return duracion;
    }

    public void setDuaracion(int duaracion) {
        this.duracion = duaracion;
    }

    public short getAño() {
        return año;
    }

    public void setAño(short año) {
        this.año = año;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
}
