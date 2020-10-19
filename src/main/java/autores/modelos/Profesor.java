
package autores.modelos;


public class Profesor extends Autor {
   
    private Cargo cargo;

//aqui se agrega el constructor 
    public Profesor( int DNI, String apellidos, String nombres, String Clave,Cargo cargo) {
        
        super(DNI, apellidos, nombres, Clave);
        this.cargo = cargo;
     
    }

     public void mostrarprofesor()
   {
      super.MostrarDatos();
      System.out.println("\nCargo: "+this.cargo+"\n");   
   }

    public Cargo verCargo() {
        return cargo;
    }

    public void asignarCargo(Cargo cargo) {
        this.cargo = cargo;
    }
   
   }