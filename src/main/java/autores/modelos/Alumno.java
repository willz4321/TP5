/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Alumno extends Autor{
   
    private int Cx;
//aqui se agrega el constructor
    public Alumno(int dni, String apellidos, String nombres, String Clave, int Cx) {
        
        super(dni, apellidos, nombres, Clave);
        this.Cx = Cx;
    }
    
     public void mostrar() {
         
         super.MostrarDatos();
         System.out.println("\nCX: "+Cx);
    }

//
    public int verCx() {
        return Cx;
    }

    public void asignarCx(int Cx) {
        this.Cx = Cx;
    }    

    @Override
    public int hashCode() {
        return super.hashCode() + this.Cx;
       
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        
        super.equals(obj);
        if(!super.equals(obj))
        {
             if(obj instanceof Alumno) {
                return Objects.equals(this.Cx, ((Alumno)obj).verCx());
             }
             else
                return false;
                 
        }
       
        return true;
    }  
}
