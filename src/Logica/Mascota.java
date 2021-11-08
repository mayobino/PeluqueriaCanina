
package Logica;

//creo la clase Mascota 

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

//agrego atributos a dicha clase
//creo los constructores y getters-setters

@Entity //esto es el mapeo que permitirá indicar qué elementos de la lógica quiero que se persistan/guarden en la base de datos.
        //Utilizo Entity para las clases que luego se transformarán en entidades
public class Mascota implements Serializable {
    
    @Id
    private int num_cliente;
    @Basic
    private String nombre_perro;
    private String raza;
    private String color;
    private String alergico;
    private String atención_especial;
    private String nombre_dueño;
    private String celular_dueño;
    private String observaciones;

    public Mascota() {
    }

    public Mascota(int num_cliente, String nombre_perro, String raza, String color, String alergico, String atención_especial, String nombre_dueño, String celular_dueño, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atención_especial = atención_especial;
        this.nombre_dueño = nombre_dueño;
        this.celular_dueño = celular_dueño;
        this.observaciones = observaciones;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String isAtención_especial() {
        return atención_especial;
    }

    public void setAtención_especial(String atención_especial) {
        this.atención_especial = atención_especial;
    }

    public String getNombre_dueño() {
        return nombre_dueño;
    }

    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_dueño = nombre_dueño;
    }

    public String getCelular_dueño() {
        return celular_dueño;
    }

    public void setCelular_dueño(String celular_dueño) {
        this.celular_dueño = celular_dueño;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }   
    
}
