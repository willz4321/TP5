
package grupos.modelos;

import interfases.IGestorGrupos;
import java.util.ArrayList;


public class GestorGrupos implements IGestorGrupos {

    private ArrayList<Grupo> GRUPOS= new ArrayList<>();
    private static GestorGrupos auxiliar;
    
    public static GestorGrupos crear(){
        if(auxiliar == null)
            auxiliar= new GestorGrupos();
            return auxiliar;
        }
    @Override
    public String nuevoGrupo(String nombre, String descripcion) {
        if((nombre!=null) && (!nombre.isBlank())){
            Grupo GRUPO=new Grupo(nombre,descripcion);
            
            if(!this.GRUPOS.contains(GRUPO)){
                this.GRUPOS.add(GRUPO);
                return Grupo_Correcto;
            }
             else{
                 return Grupo_Repetido;
            }   
        }else
             return Grupo_Incorrecto;
    }

    @Override
    public String modificarGrupo(Grupo grupo, String descripcion) {
        grupo.asignarDescripcion(descripcion);
        return Descripcion_Cambio;
    }

    @Override
    public ArrayList<Grupo> verGrupos() {
        for(Grupo g: this.GRUPOS){
          g.mostrarG();
      }
        return null;
    }

    @Override
    public Grupo verGrupo(String nombre) {
       if(GRUPOS.contains(nombre)){
          System.out.println("si existe "+nombre);
      }
      else
          
          return null;
          return null; 
    }

    @Override
    public boolean existeEsteGrupo(Grupo grupo) {
        if(grupo!=null)
            return true;
        else
            return false;
    }
    
    
}
