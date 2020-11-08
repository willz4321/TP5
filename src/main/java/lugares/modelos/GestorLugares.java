
package lugares.modelos;

import interfases.IGestorLugares;
import java.util.ArrayList;


public class GestorLugares implements IGestorLugares{

    private ArrayList<Lugar> LUGARES= new ArrayList<>();
    private static GestorLugares auxiliar;
    
    public static GestorLugares crear(){
        if(auxiliar == null)
            auxiliar= new GestorLugares();
            return auxiliar;
    }
    
    @Override
    public String nuevoLugar(String nombre) {
        
        if((nombre!=null) && (!nombre.isBlank())){
            Lugar LUGAR=new Lugar(nombre);
            
            if(!this.LUGARES.contains(LUGAR)){
                this.LUGARES.add(LUGAR);
                return Lugar_Correcto;
            }
             else{
                 return Lugar_Repetido;
            }   
        }else
             return Lugar_Incorrecto;  
    }

    @Override
    public ArrayList<Lugar> verLugares() {
        for(Lugar L: this.LUGARES){
          L.mostrarlugar();
      }
        return null;
        
    }

    @Override
    public Lugar verLugar(String nombre) {
        if(LUGARES.contains(nombre)){
          System.out.println("si existe "+nombre);
      }
      else
          
          return null;
          return null;
    }
    
    
}
