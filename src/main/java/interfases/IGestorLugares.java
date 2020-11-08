
package interfases;

import java.util.ArrayList;
import lugares.modelos.Lugar;


public interface IGestorLugares {
    
    public static final String Lugar_Correcto="Se creo con exito el lugar";
    public static final String Lugar_Incorrecto="no se pudo crear el lugar";
    public static final String Lugar_Repetido="esta repetido";
    
    public String nuevoLugar(String nombre);
    public ArrayList<Lugar> verLugares();
    public Lugar verLugar(String nombre);
}
