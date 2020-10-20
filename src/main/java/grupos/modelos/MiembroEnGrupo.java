/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Alumno;
import autores.modelos.Autor;
import autores.modelos.Profesor;
import autores.modelos.Rol;
import java.util.Objects;

/**
 *
 * @author usuario
 */
public class MiembroEnGrupo {
    private Grupo grupos;
    private Autor autor;
    private Rol  rol;
 
                
    //constructor

    public MiembroEnGrupo(Autor autor,Grupo grupos , Rol rol) {
        this.autor=autor;
        this.grupos = grupos;
        this.rol = rol;
        
    }
    
    //metodos get/set

    public Grupo getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo grupos) {
        this.grupos = grupos;
    }

  

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    
    
    public void mostrarmiembroengrupo(){
       autor.MostrarDatos();
       grupos.verNombre();
       System.out.println("Rol: "+rol.name());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.grupos);
        hash = 71 * hash + Objects.hashCode(this.autor);
        return hash;
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
        final MiembroEnGrupo other = (MiembroEnGrupo) obj;
        if (!Objects.equals(this.grupos, other.grupos)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return true;
    }

    
}


    
        
        

    
    
    

  
   

    
    
   
    
           
  
    

 
    
    
    
  
    
    
    
    

