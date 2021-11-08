
package Logica;

import IGU.CargaMascota;


public class Obino_Mayra_tpo2 {

    //Hago la conexión entre la lógica y la Interfaz Gráfica (IGU)
    //Genero una nueva instancia de CargaMascota y la importo porque está en el paquete IGU
    //Con setvisible hago la pantalla visible y con setLocation le asigno lugar en el medio.
    
    public static void main(String[] args) {
        
        CargaMascota pantalla = new CargaMascota();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
    }
    
}
