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
    private Profesor profesores;
    private Rol  rol;
    private Alumno Alumnos;
    private Autor Autores;
    //constructor

    public MiembroEnGrupo(Grupo grupos, Profesor profesores, Rol rol,Alumno Alumno) {
        this.grupos = grupos;
        this.profesores = profesores;
        this.rol = rol;
        this.Alumnos=Alumno;
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

    public Alumno getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(Alumno Alumnos) {
        this.Alumnos = Alumnos;
    }
    
    public void mostrarmiembroengrupo(){
       profesores.MostrarDatos();
       grupos.verNombre();
       Alumnos.mostrar();
       System.out.println("\n Rol: "+rol.name());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.Autores);
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
       super.equals(obj); 
        return super.equals(obj) != false;
    }

  
    
    
    
  }
    
    
    
    

