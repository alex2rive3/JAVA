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
public class Serie extends Film{
    public int id;
    public float tiempoVisto;
    public int cantidadTemporadas;
    public int capitulos;

    public Serie(String titulo, String creador, String genero, int duracion, short año, boolean visto) {
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
    
    public void mostrarDatoSerie(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Genero: "+genero);
        System.out.println("Duracion: "+duracion);
        System.out.println("Capitulos: "+capitulos);
        System.out.println("Año: "+año);
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
    
}
