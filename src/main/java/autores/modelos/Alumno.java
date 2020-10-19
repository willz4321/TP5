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
public class Alumno {
    
    private String nombres;
    private String apellidos;
    private int dni;
    private String Clave;
    private String Cx;
//aqui se agrega el constructor
    public Alumno(String nombres, String apellidos, int dni, String Clave, String Cx) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.Clave = Clave;
        this.Cx = Cx;
    }

    public Alumno(int dni, String apellidos, String nombres, String clave, String cx) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //aqui se agregan los metodos get y set para cada atributo
    
    public String verNombres() {
        return nombres;
    }

    public void asignarNombres(String nombres) {
        this.nombres = nombres;
    }

    public String verApellidos() {
        return apellidos;
    }

    public void asignarApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int verDni() {
        return dni;
    }

    public void asignarDni(int dni) {
        this.dni = dni;
    }

    public String verClave() {
        return Clave;
    }

    public void asignarClave(String Clave) {
        this.Clave = Clave;
    }

    public String verCx() {
        return Cx;
    }

    public void asignarCx(String Cx) {
        this.Cx = Cx;
    }

    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //aqui voy a definir los metodos equals y hashcode para la clase alumno

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.dni;
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
        final Alumno other = (Alumno) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    
    
}
