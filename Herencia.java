package herencia;

import static herencia.Libro.listaLibro;
import static herencia.Capitulo.listaCapitulos;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Libro> listaLibro = new ArrayList(listaLibro());
        System.out.println(listaLibro);
        ArrayList<Capitulo> listaCapitulos = new ArrayList(listaCapitulos());
        System.out.println(listaCapitulos);
    }
    
}
