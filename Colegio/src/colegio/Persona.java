/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author Javier Reyes Neira
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String edad;
    
    
    
    //Contructor
 public Persona(String nombre, String apellido, String edad)
 
 {
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
 
}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEdad() {
        return edad;
    }
 
 
 
 
 
}