
package tipos.modelos;

import interfases.IGestorTipos;
import java.util.ArrayList;


public class GestorTipos implements IGestorTipos{
    
    private ArrayList<Tipo> TIPOS= new ArrayList<>();
    private static GestorTipos auxiliar;
    
    public static GestorTipos crear(){
        if(auxiliar == null)
            auxiliar= new GestorTipos();
            return auxiliar;
    }
    
    @Override
    public String nuevoTipo(String nombre) {
       
        if((nombre!=null) && (!nombre.isBlank())){
            Tipo tipo=new Tipo(nombre);
            
            if(!this.TIPOS.contains(tipo)){
                this.TIPOS.add(tipo);
                return Tipo_Correcto;
            }
             else{
                 return Tipo_Repetido;
            }   
        }else
             return Tipo_Incorrecto;  
    }

    @Override
    public ArrayList<Tipo> verTipos() {
        
        for(Tipo t: this.TIPOS){
         return ;
      }
        return null;
        
    }

    @Override
    public  Tipo verTipo(String nombre) {
        
      if(TIPOS.contains(nombre)){
          System.out.println("si existe "+nombre);
      }
      else
          
          return null;
          return null;
    }
     
}
