/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Profesor;
import autores.modelos.Rol;

/**
 *
 * @author usuario
 */
public class MiembroEnGrupo {
    private Grupo grupos;
    private Profesor profesores;
    private Rol  rol;
    
    //constructor

    public MiembroEnGrupo(Grupo grupos, Profesor profesores, Rol rol) {
        this.grupos = grupos;
        this.profesores = profesores;
        this.rol = rol;
    }
    
    //metodos get/set

    public Grupo getGrupos() {
        return grupos;
    }

    public void setGrupos(Grupo grupos) {
        this.grupos = grupos;
    }

    public Profesor getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor profesores) {
        this.profesores = profesores;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
    
    public void mostrarmiembroengrupo(){
       System.out.println("Autor: "+profesores.verNombres()+" "+" "+profesores.verApellidos());
       grupos.verNombre();
       System.out.println("\n Rol: "+rol.name());
    }
 
  }
    
    
    
    

