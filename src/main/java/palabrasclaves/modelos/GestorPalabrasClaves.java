
package palabrasclaves.modelos;

import interfases.IGestorPalabrasClaves;
import java.util.ArrayList;


public class GestorPalabrasClaves implements IGestorPalabrasClaves {

     private ArrayList<PalabraClave> PCLAVES= new ArrayList<>();
    private static GestorPalabrasClaves auxiliar;
    
    public static GestorPalabrasClaves crear(){
        if(auxiliar == null)
            auxiliar= new GestorPalabrasClaves();
            return auxiliar;
    }
    
    @Override
    public String nuevaPalabraClave(String nombre) {
       
        if((nombre!=null) && (!nombre.isBlank())){
            PalabraClave Pclave=new PalabraClave(nombre);
            
            if(!this.PCLAVES.contains(Pclave)){
                this.PCLAVES.add(Pclave);
                return Clave_Correcto;
            }
             else{
                 return Clave_Repetido;
            }   
        }else
             return Clave_Incorrecto;  
    }       

    @Override
    public ArrayList<PalabraClave> verPalabrasClaves() {
       for(PalabraClave PC: this.PCLAVES){
          PC.mostrarpalabraclave();
      }
        return null;
    }

    @Override
    public PalabraClave verPalabraClave(String nombre) {
        if(PCLAVES.contains(nombre)){
          System.out.println("si existe "+nombre);
      }
      else
          
          return null;
          return null;
    }
    
    
}
