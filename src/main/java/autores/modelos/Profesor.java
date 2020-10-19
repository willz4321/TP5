/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.modelos;

/**
 *
 * @author usuario
 */
public class Profesor {
    private int dni;
    private String apellidos;
    private String nombres;
    private String Clave;
    private Cargo cargo;

//aqui se agrega el constructor 
    public Profesor(int dni, String apellidos, String nombres, String Clave, Cargo cargo) {
        this.dni = dni;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.Clave = Clave;
        this.cargo = cargo;
       
    }

 
  //aqui se agregan los metodos get y set para cada atributo
    
    public int verDni() {
        return dni;
    }

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public String verApellidos() {
        return apellidos;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String verNombres() {
        return nombres;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String verClave() {
        return Clave;
    }

    public void asignarClave(String Clave) {
        this.Clave = Clave;
    }

    public Cargo verCargo() {
        return cargo;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }

   public void mostrarprofesor()
   {
      System.out.println("Nombre y apellido: "+this.nombres+" "+" "+this.apellidos+"\n");
      System.out.println("clave: "+this.Clave+"\n");
      System.out.println("Cargo: "+this.cargo+"\n");
      System.out.println("Dni: "+this.dni+"\n");
        
   }
   //aqui voy a definir los metodos equals y hashcode para la clase profesor

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.dni;
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
        final Profesor other = (Profesor) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
   
   

 
}
