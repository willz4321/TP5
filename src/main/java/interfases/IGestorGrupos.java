
package interfases;

import grupos.modelos.Grupo;
import java.util.ArrayList;


public interface IGestorGrupos {
 
    public static final String Grupo_Correcto="Se creo con exito el nuevo grupo";
    public static final String Grupo_Incorrecto="no se pudo crear el nuevo grupo";
    public static final String Grupo_Repetido="esta repetido";    
    public static final String Descripcion_Cambio="se cambio la descipcion";
    
public String nuevoGrupo(String nombre, String descripcion);
public String modificarGrupo(Grupo grupo, String descripcion);
public ArrayList<Grupo> verGrupos();
public Grupo verGrupo(String nombre);
public boolean existeEsteGrupo(Grupo grupo);

}
