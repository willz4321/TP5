
package autores.modelos;

public abstract class Autor {
    
    private int DNI;
    private String apellidos;
    private String nombres;
    private String Clave;

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
        int hash = 3;
        hash = 23 * hash + this.DNI;
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
        }
        final Autor other = (Autor) obj;
        if (this.DNI != other.DNI) {
            return false;
        }
        return true;
    }
    
    
}
