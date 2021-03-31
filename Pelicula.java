/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;
import java.util.Date;
import lib.funcion;

/**
 *
 * @author Ruben
 */
public class Pelicula extends Film implemet IVisualizable {
    public int id;
    public float tiempoVisto;

    public Pelicula() {
    }

    public Pelicula(String titulo, String genero, String creador, int duracion, int año) {
        super(titulo, genero, creador, duracion);
        this.setAño(año);
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

    @Override
    public String toString() {
        return "Titulo: "+ this.getTitulo() +
                "\nGenero: " + this.getGenero() +
                "\nAño: " + this.getAño() +
                "\nCreador: " + this.getCreador() + 
                "\nDuracion: "+ this.getDuracion();
    }
    
    public Date empezarVer(Date inicio){
        return inicio;
    }
    
    public void paraVer(Date inicio, Date fin){
        int resultado = fin.getTime() > inicio.getTime() ? (int) (fin.getTime() - inicio.getTime()) / 1000 : 0;
	this.setTimeViewed(resultado);
    }

    private void setTimeViewed(int resultado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static ArrayList<Pelicula> crearListaPelicula(){
        Pelicula pelis = new Pelicula();
        return pelis.read();
    }
    public static ArrayList<Pelicula> crearDatePelis(Date date){
        Pelicula pelis = new Pelicula();
        return pelis.getMoviesViewedByDate(date);
    }
    public void view(){
        this.setVisto(true);
        Date inicio = this.empezarVer(new Date());
        funcion.tiempo();
        
        Pelicula pelis = new Pelicula();
        pelis.setMovieViewed(this);
        this.paraVer(inicio, new Date());
        System.out.println("Viste \"" + this.getTitulo() + "\" en " + this.getTiempoVisto() + " segundos !! ");
    }
    private ArrayList<Pelicula> getMoviesViewedByDate(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Pelicula> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setMovieViewed(Pelicula aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
