/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicaciones.modelos;

import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.Idioma;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import lugares.modelos.Lugar;
import palabrasclaves.modelos.PalabraClave;
import tipos.modelos.Tipo;

/**
 *
 * @author usuario
 */
public class Publicacion {
    
   private String titulo;
   private LocalDate fechaPublicacion;
   private String enlace;
   private String resumen;
   // podemos pedirle tambien que nos diga el idioma, el tipo, el lugar, las palabras claves y los miembros del grupo
   private Idioma idiomas;
   private Tipo tipos;
   private Lugar lugares;
   private ArrayList<PalabraClave> vectorpalabraclave ;
   private MiembroEnGrupo miembroengrupo;
   
   //constructor 

    public Publicacion(String titulo, LocalDate fechaPublicacion, String enlace, String resumen, Idioma idiomas, Tipo tipos, Lugar lugares, ArrayList<PalabraClave> vectorpalabraclave, MiembroEnGrupo miembroengrupo) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.enlace = enlace;
        this.resumen = resumen;
        this.idiomas = idiomas;
        this.tipos = tipos;
        this.lugares = lugares;
        this.vectorpalabraclave = vectorpalabraclave;
        this.miembroengrupo = miembroengrupo;
    }
   

//    public Publicacion(String titulo, LocalDate fechaPublicacion, String enlace, String resumen) {
//        this.titulo = titulo;
//        this.fechaPublicacion = fechaPublicacion;
//        this.enlace = enlace;
//        this.resumen = resumen;
//        
//    }
    

    public Publicacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   
   
   
   
   
   
   
   
   public void mostrartodo(){
       System.out.println("Los atributos: "+titulo+"\n "+" "+fechaPublicacion+"\n "+" "+enlace+"\n "+" "+resumen);
       idiomas.mostraridioma();
       tipos.mostrartipo();
       lugares.mostrarlugar();
       for (PalabraClave p: vectorpalabraclave)
       {
           p.mostrarpalabraclave();
       }
      miembroengrupo.mostrarmiembroengrupo();
   }
   
   
//aqui voy a definir los metodos equals y hashcode para la clase publicacion

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.titulo);
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
        final Publicacion other = (Publicacion) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }
   
   
    
   
   

} 