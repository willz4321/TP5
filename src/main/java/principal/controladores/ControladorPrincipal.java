/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.controladores;

import autores.modelos.Alumno;
import autores.modelos.Cargo;
import autores.modelos.Profesor;
import autores.modelos.Rol;
import autores.vistas.VentanaAMAlumno;
import autores.vistas.VentanaAMProfesor;
//import autores.vistas.VentanaAMProfesor;
import grupos.modelos.Grupo;
import grupos.modelos.MiembroEnGrupo;
import grupos.vistas.VentanaAMGrupo;
import idiomas.modelos.Idioma;
import idiomas.vistas.VentanaAIdioma;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import lugares.modelos.Lugar;
import lugares.vistas.VentanaALugar;
import palabrasclaves.modelos.PalabraClave;
import palabrasclaves.vistas.VentanaAPalabraClave;
import publicaciones.modelos.Publicacion;
import tipos.modelos.Tipo;
import tipos.vistas.VentanaATipo;

/**
 *
 * @author usuario
 */
public class ControladorPrincipal {
    
    public static void main(String[] args) {
      // instancio las clases , crear objetos para cada clase
      // Clase Lugar
        Lugar unlugar1 = new Lugar("espacio1");
        Lugar unlugar2 = new Lugar ("espacio2");
        Lugar unlugar3 =new Lugar(" espacio3");
        Lugar unlugar4=new Lugar("espacio4");
        Lugar unlugar5=new Lugar("espacio5");
       // Lugar unlugar6=new Lugar();
        //si creo objetos vacios, sale un error de compilacion
        
       //Clase Idioma
        Idioma unidioma1=new Idioma("ingles");
        Idioma unidioma2=new Idioma("español");
        Idioma unidioma3=new Idioma("frances");
        Idioma unidioma4=new Idioma("italiano");
        Idioma unidioma5=new Idioma("portugues");
           
        //Clase grupo
        Grupo ungrupo1=new Grupo("grupo1","descripcion1");
        Grupo ungrupo2=new Grupo("grupo2","descripcion2");
        Grupo ungrupo3=new Grupo("grupo3","descripcion3");
        Grupo ungrupo4=new Grupo("grupo4","descripcion4");
        Grupo ungrupo5=new Grupo("grupo5","descripcion5");
        //Clase tipo
        Tipo untipo1=new Tipo("tipo1");
        Tipo untipo2=new Tipo("tipo1");
        Tipo untipo3=new Tipo("tipo3");
        Tipo untipo4=new Tipo("tipo4");
        Tipo untipo5=new Tipo("tipo5");
        //Clase palabraclave
        PalabraClave unapalabraclave1=new PalabraClave("palabraclave1");
        PalabraClave unapalabraclave2=new PalabraClave("palabraclave3");
        PalabraClave unapalabraclave3=new PalabraClave("palabraclave3");
        PalabraClave unapalabraclave4=new PalabraClave("palabraclave4");
        PalabraClave unapalabraclave5=new PalabraClave("palabraclave5");
        //Clase Alumno
        Alumno unalumno1 =new Alumno("ariel","ponce",40088805,"clave1","1602230");
        Alumno unalumno2 =new Alumno("rocio","toledo",40088235,"clave2","1602233");
        Alumno unalumno3 =new Alumno("pablo","ponce",40088805,"clave3","1602234");
        Alumno unalumno4 =new Alumno("diego","ponce",40088805,"clave4","1602235");
        Alumno unalumno5 =new Alumno("gladys","ponce",40088805,"clave5","1602236");
        //Clase profesor 
        Profesor unprofesor1=new Profesor(1233321,"nombre1","apellido1","clave1",Cargo.TITULAR);
        Profesor unprofesor2=new Profesor(1233322,"nombre2","apellido2","clave2",Cargo.ADG);
        Profesor unprofesor3=new Profesor(1233323,"nombre3","apellido3","clave3",Cargo.ADJUNTO);
        Profesor unprofesor4=new Profesor(1233324,"nombre4","apellido4","clave4",Cargo.ASOCIADO );
        Profesor unprofesor5=new Profesor(1233325,"nombre5","apellido5","clave5",Cargo.JTP);
        
        MiembroEnGrupo miembroengrupo1 =new MiembroEnGrupo(ungrupo1,unprofesor1,Rol.ADMINISTRADOR );
        MiembroEnGrupo miembroengrupo2=new MiembroEnGrupo(ungrupo2,unprofesor2,Rol.COLABORADOR); 
        MiembroEnGrupo miembroengrupo3=new MiembroEnGrupo(ungrupo4,unprofesor4,Rol.COLABORADOR); 
        MiembroEnGrupo miembroengrupo4=new MiembroEnGrupo(ungrupo3,unprofesor3,Rol.COLABORADOR); 
        MiembroEnGrupo miembroengrupo5=new MiembroEnGrupo(ungrupo5,unprofesor5,Rol.COLABORADOR); 
        
        
        
     
        
        // Creacion de los Arraylists
        ArrayList<Tipo> vectortipo;
        vectortipo= new ArrayList<>();
        ArrayList<PalabraClave>vectorpalabraclave ;
        vectorpalabraclave = new ArrayList<>();
        ArrayList<Lugar> vectorlugar;
        vectorlugar = new ArrayList<>();
        ArrayList<Idioma> vectoridioma;
        vectoridioma = new ArrayList<>();
        ArrayList<Grupo> vectorgrupo;
        vectorgrupo = new ArrayList<>();
        ArrayList<Profesor> vectorprofesor;
        vectorprofesor = new ArrayList<>();
        ArrayList<Alumno> vectoralumno;
        vectoralumno = new ArrayList<>();
        //punto 8 agrego el vector publicaciones
        ArrayList<Publicacion>vectorpublicaciones;
        vectorpublicaciones =new ArrayList<>();
        
        //aqui instanciaremos publicacion 
        Publicacion publicacion1=new Publicacion("Tesisdrone2021",LocalDate.of(2020,Month.OCTOBER,10),"enlace1","resumen1",unidioma1,untipo1,unlugar1,vectorpalabraclave,miembroengrupo2);
       
        Publicacion publicacion2=new Publicacion("fisica1",LocalDate.of(2021,Month.OCTOBER,10),"enlace2","resumen2",unidioma2,untipo2,unlugar2,vectorpalabraclave,miembroengrupo1);
         
        Publicacion publicacion3=new Publicacion("fisica1",LocalDate.of(2021,Month.OCTOBER,10),"enlace2","resumen2",unidioma2,untipo2,unlugar2,vectorpalabraclave,miembroengrupo3);
         
        Publicacion publicacion4=new Publicacion("fisica3",LocalDate.of(2021,Month.OCTOBER,10),"enlace2","resumen2",unidioma2,untipo2,unlugar2,vectorpalabraclave,miembroengrupo4);
         
        Publicacion publicacion5=new Publicacion("fisica4",LocalDate.of(2021,Month.OCTOBER,10),"enlace2","resumen2",unidioma2,untipo2,unlugar2,vectorpalabraclave,miembroengrupo5);
        // AGREGAR AL ARRAYLIST TODOS LOS OBJETOS
        //arraylist tipo
        //aca pondre la verificacion de la clase tipo para no colocar 2 objetos iguales
        vectortipo.add(untipo1);
        if(!vectortipo.contains(untipo2))    
        vectortipo.add(untipo2);
        if(!vectortipo.contains(untipo3))    
        vectortipo.add(untipo3);
        if(!vectortipo.contains(untipo4))    
        vectortipo.add(untipo4);
        if(!vectortipo.contains(untipo5))    
        vectortipo.add(untipo5);
        
        
        //arraylist lugar 
         //aca pondre la verificacion de la clase lugar para no colocar 2 objetos iguales 
        vectorlugar.add(unlugar1);
        if(!vectorlugar.contains(unlugar2))
        vectorlugar.add(unlugar2);
         if(!vectorlugar.contains(unlugar3))
        vectorlugar.add(unlugar3);
          if(!vectorlugar.contains(unlugar4))
        vectorlugar.add(unlugar4);
           if(!vectorlugar.contains(unlugar5))
        vectorlugar.add(unlugar5);
           
       
       //vectorlugar.add(unlugar6); objeto vacio
       
        //arraylist grupo
        //aca pondre la verificacion de la clase grupo para no colocar 2 objetos iguales
        vectorgrupo.add(ungrupo1);
        if(!vectorgrupo.contains(ungrupo2))
        vectorgrupo.add(ungrupo2);
        if(!vectorgrupo.contains(ungrupo3))
        vectorgrupo.add(ungrupo3);
        if(!vectorgrupo.contains(ungrupo3))
        vectorgrupo.add(ungrupo3);
        if(!vectorgrupo.contains(ungrupo4))
        vectorgrupo.add(ungrupo4);
        if(!vectorgrupo.contains(ungrupo5))
        vectorgrupo.add(ungrupo5);
       
        //arraylist palabraclave
       // aca pondre la verificacion de la clase palabrasclaves para no colocar 2 objetos iguales
        vectorpalabraclave.add(unapalabraclave1);
        if(!vectorpalabraclave.contains(unapalabraclave2))
        vectorpalabraclave.add(unapalabraclave2);
        if(!vectorpalabraclave.contains(unapalabraclave3))
        vectorpalabraclave.add(unapalabraclave3);
        if(!vectorpalabraclave.contains(unapalabraclave4))
        vectorpalabraclave.add(unapalabraclave4);
        if(!vectorpalabraclave.contains(unapalabraclave5))
        vectorpalabraclave.add(unapalabraclave5);
       
        
        
       
        //arraylist 
         //aca pondre la verificacion de la clase idiomas para no colocar 2 objetos iguales
        vectoridioma.add(unidioma1);
        if(!vectoridioma.contains(unidioma2))
        vectoridioma.add(unidioma2);
        if(!vectoridioma.contains(unidioma3))
        vectoridioma.add(unidioma3);
        if(!vectoridioma.contains(unidioma4))
        vectoridioma.add(unidioma4);
        if(!vectoridioma.contains(unidioma5))
        vectoridioma.add(unidioma5);
        
        
        //arraylist alumno
        //aca pondre la verificacion de la clase alumnos para no colocar 2 objetos iguales
        vectoralumno.add(unalumno1);
        if(!vectoralumno.contains(unalumno2))
        vectoralumno.add(unalumno2);
        if(!vectoralumno.contains(unalumno3))
        vectoralumno.add(unalumno3);
        if(!vectoralumno.contains(unalumno4))
        vectoralumno.add(unalumno4);
        if(!vectoralumno.contains(unalumno5))
        vectoralumno.add(unalumno5);
        
        
        
        //arraylist profesor
        //aca pondre la verificacion de la clase profesor para no colocar 2 objetos iguales
        vectorprofesor.add(unprofesor1);
        if(!vectorprofesor.contains(unprofesor2))
        vectorprofesor.add(unprofesor2);
        if(!vectorprofesor.contains(unprofesor3))
        vectorprofesor.add(unprofesor3);
        if(!vectorprofesor.contains(unprofesor4))
        vectorprofesor.add(unprofesor4);
        if(!vectorprofesor.contains(unprofesor5))
        vectorprofesor.add(unprofesor5);
        
        //arraylistt publicacion
        ////aca pondre la verificacion de la clase publicacion para no colocar 2 objetos iguales
         vectorpublicaciones.add(publicacion1);
         if(!vectorpublicaciones.contains(publicacion2))
         vectorpublicaciones.add(publicacion2);
          if(!vectorpublicaciones.contains(publicacion3))
         vectorpublicaciones.add(publicacion3);
          if(!vectorpublicaciones.contains(publicacion4))
         vectorpublicaciones.add(publicacion4);
           if(!vectorpublicaciones.contains(publicacion5))
         vectorpublicaciones.add(publicacion5);
           
        
        
             
        
//         // modificaciones de los arraylist 
//          
//         unlugar1.asignarNombre("escaba");
//         unlugar5.asignarNombre("cataratas");
//         
        
        //Recorrido de los arraylist y muestra por pantalla
            //vectoralumno
        for(Alumno r: vectoralumno)
        {
            System.out.println("Los atributos son:" +r.verApellidos()+" "+ " "+r.verClave()+" "+" "+r.verCx()+" "+" "+r.verNombres());
                    }
//           //vectorprofesor
           for(Profesor r: vectorprofesor)
        {
            System.out.println("Los atributos son:" +r.verApellidos()+" "+ " "+r.verClave()+" "+" "+r.verCargo()+" "+" "+r.verNombres());
                    }
           //vectortipo
            for(Tipo r: vectortipo)
        {
            System.out.println("Los atributos son:" +r.verNombre());
        }
//            //vectorpalabraclave
            for(PalabraClave r: vectorpalabraclave)
        {
            System.out.println("Los atributos son: "+r.verNombre());
        }
//            //vectoridioma
            for(Idioma r: vectoridioma)
        {
            System.out.println("Los atributos son:" +r.verNombre());
        }
//             //vectorlugar
            for(Lugar r: vectorlugar)
        {
            System.out.println("Los atributos son:"+r.verNombre());
        }
//            //vectorgrupo
         for(Grupo r: vectorgrupo)
        {
            System.out.println("Los atributos son:"+r.verDescripcion()+" "+" "+r.verNombre());
        }    
//         
          
         // aqui deharemos que publicacion se muestre 
         
         System.out.println("\n");
         System.out.println("Aqui mostraremos publicacion\n");
         
         for(Publicacion a: vectorpublicaciones)
         {
             a.mostrartodo();
         }
//         Publicacion publicacion2=new Publicacion("Tesisdrone2021",LocalDate.of(2020,Month.OCTOBER,10),"enlace1","resumen1",unidioma1,untipo1,unlugar1,vectorpalabraclave,miembroengrupo2));
//         
//         Publicacion publicacion2=new Publicacion("Tesisdrone2021",LocalDate.of(2020,Month.OCTOBER,10),"enlace1","resumen1",unidioma1,untipo1,unlugar1,vectorpalabraclave,miembroengrupo2));
//         
//         Publicacion publicacion2=new Publicacion("Tesisdrone2021",LocalDate.of(2020,Month.OCTOBER,10),"enlace1","resumen1",unidioma1,untipo1,unlugar1,vectorpalabraclave,miembroengrupo2));
//         publicacion1.mostrartodo();
         
         
         
         
         //intento modificar los atributos de los objetos accediendo directamente
         
         // unlugar1.nombre="ariel" 
                 
          // no puedo acceder a los oobjetos porque las variables de instancias son privadas */
       //instancio la ventana de idiomas
//       VentanaAIdioma ventanaidioma =new VentanaAIdioma(null);
//       ventanaidioma.setLocationRelativeTo(null);
//       ventanaidioma.setVisible(true);
//       //instancio la ventana de lugares
//       VentanaALugar ventanalugar =new VentanaALugar(null);
//       ventanalugar.setLocationRelativeTo(null);
//       ventanalugar.setVisible(true);
//      
//       //instancio la ventana de alumnos
//       VentanaAMAlumno ventanaalumno=new VentanaAMAlumno(null);
//       ventanaalumno.setLocationRelativeTo(null);
//       ventanaalumno.setVisible(true);
//       //instancio la ventana de profesores 
//       VentanaAMProfesor ventanaprofesor=new VentanaAMProfesor(null);
//       ventanaprofesor.setLocationRelativeTo(null);
//       ventanaprofesor.setVisible(true);
//       // instancio la ventana tipo
//       VentanaATipo ventanatipo=new VentanaATipo();
//       ventanatipo.setLocationRelativeTo(null);
//       ventanatipo.setVisible(true);
//       //instancio la ventana de palabras claves
//       VentanaAPalabraClave ventanapalabraclave=new VentanaAPalabraClave(null);
//       ventanapalabraclave.setLocationRelativeTo(null);
//       ventanapalabraclave.setVisible(true);
//        //instancio la ventana de grupo
//       VentanaAMGrupo ventanagrupo=new VentanaAMGrupo(null);
//       ventanagrupo.setLocationRelativeTo(null);
//       ventanagrupo.setVisible(true);
//       //revisar

//VentanaAMProfesor ventanaprofesor=new VentanaAMProfesor(null);
//ventanaprofesor.setLocationRelativeTo(null);
//ventanaprofesor.setVisible(true);
//       
       
       
       
       
       
       
         
          
         
          
          
          
          
         
    }
        
        
        
        } 
        
        
   

