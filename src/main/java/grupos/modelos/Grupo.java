/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos.modelos;

import autores.modelos.Autor;
import autores.modelos.Rol;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author usuario
 */
public class Grupo {
    private String nombre;
    private String descripcion;
    private MiembroEnGrupo miembroengrupo;
    
//aqui se agrega el constructor
    public Grupo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
//aqui se agrega los metodos get y set para cada atributo
    public String verNombre() {
        return nombre;
    }

    public void asignarNombre(String nombre) {
        this.nombre = nombre;
    }

    public String verDescripcion() {
        return descripcion;
    }

    public void asignarDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarG() {
        System.out.println("el nombre del grupo es: "+nombre+"\n"+"descripcion: "+descripcion);
    }
    //creo el arraylist de MiembroEnGrupo
    private ArrayList<MiembroEnGrupo>miembros=new ArrayList<>();
    //aqui muestro el conjunto de los objetos de miembrosengrupo
    public void verMiembros(){
        for(MiembroEnGrupo m: miembros)          
        m.mostrarmiembroengrupo();
    }
    
    //aqui creo el metodo agregarMiembros(Autor autor,Rol rol)
    
    public void agregarMiembro(Autor autor,Rol rol)
    {
        MiembroEnGrupo miembroengrupo=new MiembroEnGrupo(autor,null,rol);
        if(!this.miembros.contains(miembroengrupo))
            this.miembros.add(miembroengrupo);
                             
    }
    //zqui se creo el metodo quitarMiembros(Autor miembro)
    public void quitarMiembro(Autor miembro)
    {
        MiembroEnGrupo unMiembro=new MiembroEnGrupo(miembro,null,null);
        if(this.miembros.contains(unMiembro))
        {
            miembros.remove(miembros.indexOf(unMiembro));
        }
        
    }
    
    public boolean esSuperAdministradores()
    {
        
            return this.nombre.equalsIgnoreCase("Super Administradores");
        
    }
        
    
    
    
    public boolean tieneMiembros()
    {
     if(!this.miembros.isEmpty()){
         return true;
     }
         return false;
    }     
    
    
    
    
    //Aqui voy a definir los metodos equals y hashcode para la clase grupo

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.miembros);
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
        final Grupo other = (Grupo) obj;
        if (!Objects.equals(this.miembros, other.miembros)) {
            return false;
        }
        return true;
    }

    public boolean contains(MiembroEnGrupo MiembroAutor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

  
    
}
