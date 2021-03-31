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
public class Libro extends Publicacion{
    public int id;
    public String isdn;
    public boolean leido;
    public float tiempoLectura;

    public Libro(String titulo, Date fechaEdicion, String editorial) {
        super(titulo, fechaEdicion, editorial);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsdm() {
        return isdn;
    }

    public void setIsdm(String isdm) {
        this.isdn = isdm;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public float getTiempoLectura() {
        return tiempoLectura;
    }

    public void setTiempoLectura(float tiempoLectura) {
        this.tiempoLectura = tiempoLectura;
    }

    @Override
    public String toString() {
        return "Libro: "+getTitulo() +
                "\n Editorial: " + getEditorial()+
                "\n Fecha de Edicion: "+getFechaEdicion();
    }

    public static ArrayList<Libro> listaLibro(){
        ArrayList<Libro> libros = new ArrayList<>();
        Libro lista = new Libro("Titulo", new Date(), "Editorial");
        libros.add(lista);
        return libros;
    }

}
