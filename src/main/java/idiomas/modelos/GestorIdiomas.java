
package idiomas.modelos;

import interfases.IGestorIdiomas;
import java.util.ArrayList;


public class GestorIdiomas implements IGestorIdiomas{

    private ArrayList<Idioma> IDIOMAS= new ArrayList<>();
    private static GestorIdiomas auxiliar;
    
    public static GestorIdiomas crear(){
        if(auxiliar == null)
            auxiliar= new GestorIdiomas();
            return auxiliar;
       }
    
    @Override
    public String nuevoIdioma(String nombre) {
        if((nombre!=null) && (!nombre.isBlank())){
            Idioma IDIOMA=new Idioma(nombre);
            
            if(!this.IDIOMAS.contains(IDIOMA)){
                this.IDIOMAS.add(IDIOMA);
                return Idioma_Correcto;
            }
             else{
                 return Idioma_Repetido;
            }   
        }else
             return Idioma_Incorrecto;
    }

    @Override
    public ArrayList<Idioma> verIdiomas() {
        for(Idioma i: this.IDIOMAS){
          i.mostraridioma();
      }
        return null;
    }

    @Override
    public Idioma verIdioma(String nombre) {
        if(IDIOMAS.contains(nombre)){
          System.out.println("si existe "+nombre);
      }
      else
          
          return null;
          return null;
    }
    
     
}
