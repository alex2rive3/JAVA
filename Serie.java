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
 * @author Ruben
 */
public class Serie extends Film{
    public int id;
    public float tiempoVisto;
    public int cantidadTemporadas;
    public int capitulos;

    public Serie(String titulo, String creador, String genero, int duracion, int año, boolean visto) {
        super(titulo, creador, genero,duracion, año, visto);
    }

    @Override
    public String toString() {
        return "Titulo: "+getTitulo() +
                "\n Genero"+getGenero()+
                "\n Año "+ getAño()+
                "\n Duracion"+getDuaracion()+
                "\n Capitulos"+getCapitulos();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public float getTiempoVisto() {
        return tiempoVisto;
    }

    public void setTiempoVisto(float tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }

    public int getCantidadTemporadas() {
        return cantidadTemporadas;
    }

    public void setCantidadTemporadas(int cantidadTemporadas) {
        this.cantidadTemporadas = cantidadTemporadas;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
    public static ArrayList<Serie> listaSerie(){
        ArrayList<Serie> Series = new ArrayList<>();
        Serie lista = new Serie("titulo", "creador", "genero", 12, 2001, false);
        Series.add(lista);
        return Series;
    }
    
}
