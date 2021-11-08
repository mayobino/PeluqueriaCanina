
package Persistencia;

import Logica.Mascota;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    //Debo asociar esta controladora de persistencia con la mascota jpa
    //llamo al constructor que cree anteriormente en MascotaJpaController para que se terminen de unir las 3 capas
    
    MascotaJpaController jpaMascota = new MascotaJpaController();
    
    //Creo un método altaMascota que recibirá el objeto creado y lo enviará a la base de datos
    //utilizo try y catch para que intente crear la mascota, y si no puede arroje una excepción

    public void altaMascota (Mascota mascota) {
        try {
            jpaMascota.create(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
