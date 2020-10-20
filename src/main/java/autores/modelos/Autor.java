
package autores.modelos;

import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import java.util.ArrayList;

public abstract class Autor {
    
    private int DNI;
    private String apellidos;
    private String nombres;
    private String Clave;
    private ArrayList<MiembroEnGrupo> grupos= new ArrayList<>();
    
    public  Autor(int DNI, String apellidos, String nombres, String Clave) {
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.Clave = Clave;
    }
    
    public void MostrarDatos()
    {
      System.out.println("LOS DATOS SON: \n"+ "["+DNI+"] "+apellidos+","+nombres);
      
    }
    
    public ArrayList<MiembroEnGrupo> verGrupos(){
           return grupos;
       }

    public void AgregrarGrupos(Grupo grupo,Rol rol){
       
     MiembroEnGrupo MiembroAutor= new MiembroEnGrupo(this,grupo,rol); 
     
     if(!this.grupos.contains(MiembroAutor))
         this.grupos.add(MiembroAutor);
     if(!grupo.contains(MiembroAutor))
         grupo.agregarMiembro(this,rol);
    }
    
public void QuitarGrupo(Grupo grupo){
        
         MiembroEnGrupo unMiembro= new MiembroEnGrupo(this,grupo,null);
         
         if(!this.grupos.contains(unMiembro))
             grupo.quitarMiembro(this);
      
    }
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.DNI;
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
        if (this.getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        } else {
        }
        final Autor other = (Autor) obj;
        if (this.DNI != other.DNI) {
            return false;
        }
        return true;
    }
    
    
    
}
