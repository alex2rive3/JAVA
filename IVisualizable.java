package herencia;

import java.util.Date;

/**
 *
 * @author Ruben
 */
public interface IVisualizable {
    //metodo para capturar el tiempo de inicio de la visualizacion
    Date empezarVer(Date inicio);
    //metoso para saber el tiempo que transcurrio desde el inicio de la visualizacion hasta el final
    Date paraVer(Date inicio, Date fin);
}
