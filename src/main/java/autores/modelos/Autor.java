
package autores.modelos;

public class Autor {
    
    private int DNI;
    private String apellidos;
    private String nombres;
    private String Clave;

    public Autor(int DNI, String apellidos, String nombres, String Clave) {
        this.DNI = DNI;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.Clave = Clave;
    }
    
    public void MostrarDatos()
    {
      System.out.println("LOS DATOS SON: \n"+ "["+DNI+"] "+apellidos+","+nombres);
    }
    
}
