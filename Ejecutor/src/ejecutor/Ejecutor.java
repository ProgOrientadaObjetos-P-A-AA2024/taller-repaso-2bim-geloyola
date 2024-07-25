/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecutor;

import java.util.ArrayList;
import java.util.List;
import paquete02.*;
import paquete03.*;

/*
 *
 * @author utpl
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Vehiculo> lista = new ArrayList();
        // Crear compradores
        Comprador comprador1 = new Comprador("Andres Cardenas",
                "1106926583");
        Comprador comprador2 = new Comprador("Gaby Loyola",
                "110387254");

        // Crear vehículos
        TipoSedan sedan1 = new TipoSedan(comprador1, "Toyota",
                32000, 5);
        sedan1.establecerValorDescuento();
        sedan1.establecerSeguroAdicional();
        lista.add(sedan1);

        TipoSedan sedan2 = new TipoSedan(comprador2, "ford",
                20000, 7);
        sedan2.establecerValorDescuento();
        sedan2.establecerSeguroAdicional();
        lista.add(sedan2);

        TipoSuv suv1 = new TipoSuv(comprador2, "Chevrolet",
                25000, 10);
        suv1.establecerSeguroPersonas();
        lista.add(suv1);

        TipoCamioneta camio1 = new TipoCamioneta(comprador2,
                "Maza", 42000, 12);
        camio1.establecerValorAdicional();
        camio1.establecerSeguroAdicional();
        lista.add(camio1);

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerPrecioFinal();
        }
        Consecionaria consecio = new Consecionaria(lista, "Daniel");
        consecio.establecerVentasTotales();
        consecio.establecerCostoMenor();
        System.out.println(consecio);
    }

}
