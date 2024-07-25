/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabyl
 */
public class Consecionaria {

    private ArrayList<Vehiculo> lista;
    private String nombre;
    private double ventasTotales = 0;
    private double costoMenor;

    public Consecionaria(ArrayList vehiculos, String name) {
        lista = vehiculos;
        nombre = name;
    }

    public void establecerLista(ArrayList<Vehiculo> x) {
        lista = x;
    }

    public void establecerNombre(String x) {
        nombre = x;
    }

    public void establecerVentasTotales() {
        for (int i = 0; i < lista.size(); i++) {
            ventasTotales = ventasTotales + lista.get(i).obtenerPrecioFinal();
        }
    }

    public void establecerCostoMenor() {
        costoMenor = lista.get(0).obtenerPrecioFinal();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).obtenerPrecioFinal() < costoMenor) {
                costoMenor = lista.get(i).obtenerPrecioFinal();
            }
        }
    }
    
    public ArrayList obtenerLista(){
        return lista;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    public double obtenerVentasTotales(){
        return ventasTotales;
    }
    
    public double obtenerCostoMenor(){
        return costoMenor;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Consescionaria: %s\n",obtenerNombre());
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s",cadena,lista.get(i));
        }
        cadena = String.format("%s\nVentas totales: %.2f\nAuto con menor costo: %.2f\n"
                + "",cadena,obtenerVentasTotales(), obtenerCostoMenor());
        return cadena;
    }
}

