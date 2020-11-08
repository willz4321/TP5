
package interfases;

import idiomas.modelos.Idioma;
import java.util.ArrayList;


public interface IGestorIdiomas {
    
    public static final String Idioma_Correcto="Se creo con exito el nuevo Idioma";
    public static final String Idioma_Incorrecto="no se pudo crear el nuevo Idioma";
    public static final String Idioma_Repetido="esta repetido";
    
    public String nuevoIdioma(String nombre);
    public ArrayList<Idioma> verIdiomas();
    public Idioma verIdioma(String nombre);
}
