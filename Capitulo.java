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
public class Capitulo extends Film{
    public int id;
    public float tiempoVisto;
    public int temporada;

    public Capitulo(float tiempoVisto, int temporada, String titulo, String creador, String genero, int duaracion, int año, boolean visto) {
        super(titulo, creador, genero, duaracion, año, visto);
        this.tiempoVisto = tiempoVisto;
        this.temporada = temporada;
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

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    public static ArrayList<Capitulo> listaCapitulos(){
        ArrayList<Capitulo> capitulos = new ArrayList<>();
        Capitulo lista = new Capitulo((float) 13.5, 5, "titulo", "creador", "genero", 45, 2014,true);
        capitulos.add(lista);
        return capitulos;
    }
}
