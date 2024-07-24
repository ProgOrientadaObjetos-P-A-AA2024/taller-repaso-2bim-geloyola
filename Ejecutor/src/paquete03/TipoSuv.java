/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import paquete02.*;

/**
 *
 * @author utpl
 */
public class TipoSuv {

    public Comprador propietario;
    public String marca;
    public double precioBase;
    public double precioFinal;
    public double porcenSeguro;
    public double seguroPersonas;

    public TipoSuv(Comprador p, String m, double pb, double ps) {
        propietario = p;
        marca = m;
        precioBase = pb;
        porcenSeguro = ps;
    }

    public void establecerPropietario(Comprador n) {
        propietario = n;
    }

    public void establecerMarca(String n) {
        marca = n;
    }

    public void establecerPrecioBase(double n) {
        precioBase = n;
    }

    public void establecerPrecioFinal(double n) {
       precioFinal = n;
    }

    public void establecerPorcenSeguro(double n) {
        porcenSeguro = n;
    }

    public void establecerSeguroPersonas(double n) {
        seguroPersonas = n;
    }

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public double obtenerPorcenSeguro() {
        return porcenSeguro;
    }

    public double obtenerSeguroPersonas() {
        return seguroPersonas;
    }
    

}
