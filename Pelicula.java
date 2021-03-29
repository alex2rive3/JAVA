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
public class Pelicula extends Film{
    public int id;
    public float tiempoVisto;

    public Pelicula(String titulo, String creador, String genero, int duracion, short año, boolean visto) {
        super(titulo, creador, genero, duracion, año, visto);
    }

    @Override
    public String toString() {
        return "Titulo: "+getTitulo() +
                "\n Genero"+getGenero()+
                "\n Año "+ getAño()+
                "\n Duracion"+getDuaracion();
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
    
}
