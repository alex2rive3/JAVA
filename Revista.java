/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.Date;

/**
 *
 * @author Alex
 */
public class Revista extends Publicacion{
    public int id;

    public Revista(int id, String titulo, Date fechaEdicion, String editorial) {
        super(titulo, fechaEdicion, editorial);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "\n Id"+id+
                "\n Libro: "+getTitulo() +
                "\n Editorial" + getEditorial()+
                "\n Fecha de Edicion"+getFechaEdicion();
    }
    
    
}
