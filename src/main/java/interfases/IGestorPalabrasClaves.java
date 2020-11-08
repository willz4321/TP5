
package interfases;

import java.util.ArrayList;
import palabrasclaves.modelos.PalabraClave;


public interface IGestorPalabrasClaves {
    
    public static final String Clave_Correcto="Se creo con exito la nueva palabra clave";
    public static final String Clave_Incorrecto="no se pudo crear la nueva palabra clave";
    public static final String Clave_Repetido="esta repetido";
    
    public String nuevaPalabraClave(String nombre);
    public ArrayList<PalabraClave> verPalabrasClaves();
    public PalabraClave verPalabraClave(String nombre);
    
}
