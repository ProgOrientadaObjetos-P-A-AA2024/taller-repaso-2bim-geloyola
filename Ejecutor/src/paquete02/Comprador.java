/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author utpl
 */
public class Comprador {
    private String nombre;
    private String cedula;

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }
    
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }
    
}
