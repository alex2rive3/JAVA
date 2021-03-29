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
public class Capitulo extends Pelicula{
    public int temporada;

    public Capitulo(int temporada, String titulo, String creador, String genero, int duracion, short año, boolean visto) {
        super(titulo, creador, genero, duracion, año, visto);
        this.temporada = temporada;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    
    
}
