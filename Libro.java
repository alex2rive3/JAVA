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

    public Libro(int id, String isdn, boolean leido, float tiempoLectura, String titulo, Date fechaEdicion, String editorial) {
        super(titulo, fechaEdicion, editorial);
        this.id = id;
        this.isdn = isdn;
        this.leido = leido;
        this.tiempoLectura = tiempoLectura;
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
                "\n Editorial" + getEditorial()+
                "\n Fecha de Edicion"+getFechaEdicion()+
                "\n Id"+id+
                "\n isdn "+ isdn+
                "\n Leido"+leido+
                "\n Tiempo Liedo"+ tiempoLectura;
    }

    public static ArrayList<String> ListaLibros(){
        ArrayList<String> libros = new ArrayList<>();
        libros.add("1"+"el principito"+"el mundo"+"30/02/1997"+"13216546848"+true+35);
        libros.add("4"+"la ciudad de papel"+"no recuerdo"+"07/12/2010"+"9876515445"+true+35);
        return libros;
    }

}
