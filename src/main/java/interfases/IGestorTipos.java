
package interfases;

import java.util.ArrayList;
import tipos.modelos.Tipo;


public interface IGestorTipos {
    
    public static final String Tipo_Correcto="Se creo con exito el nuevo Tipo";
    public static final String Tipo_Incorrecto="no se pudo crear el nuevo Tipo";
    public static final String Tipo_Repetido="esta repetido";
    public String nuevoTipo(String nombre);
    public ArrayList<Tipo> verTipos();
    public Tipo verTipo(String nombre);
}
