
package Logica;

//creo una controladora dentro de la logica para que "controle" hacia donde debe ir la información que recibe desde la interfaz gráfica

import Persistencia.ControladoraPersistencia;

public class Controladora {
 
    //creo un objeto para acceder al método altaMascota que tiene la controladora de persistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
    
    //creo un método, utilizo public void porque es un procedimiento que dará un alta, una respuesta.
    //le paso los parámetros correspondientes.
    
    public void altaMascota (int num_cliente, String nombre_perro, String raza, String color, String alergico, String atención_especial, String nombre_dueño, String celular_dueño, String observaciones){
    
        //creo una instancia Mascota y comienzo a settear los valores
        Mascota mascota = new Mascota ();
        mascota.setNum_cliente(num_cliente);
        mascota.setNombre_perro(nombre_perro);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtención_especial(atención_especial);
        mascota.setNombre_dueño(nombre_dueño);
        mascota.setCelular_dueño(celular_dueño);
        mascota.setObservaciones(observaciones);
        
        //Llamo a la controladora de persistencia y solicita dar de alta la nueva mascota creada
        controlPersis.altaMascota(mascota);
        
    }
}
