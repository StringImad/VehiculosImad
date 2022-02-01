/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.proyectovehiculosimad;

import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class MisVehiculos {

    public static void main(String args[]) {
        //ArrayList <Vehiculo> listaVehiculos = new ArrayList<>();

        Vehiculo[] listaVehiculos = new Vehiculo[100];
        System.out.println("Creamos 100 vehiculos aleatorios");

        for (int i = 0; i < 100; i++) {
           // listaVehiculos.add(new Vehiculo());
            listaVehiculos[i] = (new Vehiculo());
        }

        for (Vehiculo listaVehiculo : listaVehiculos) {
            System.out.println(listaVehiculo.toStringCorto());
        }
// este programa crea un objeto de la clase vehiculo y
// muestra sus atributos
// instanciación del objeto vehiculo1
//        Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco",
//                100.0);
//
//        Vehiculo miCacharro = new Vehiculo("3050 BSM", "Ford", "Fiesta", "Blanco",
//                200.0);
//
//// invocación de métodos para mostrar los datos del objeto vehiculo1
//        System.out.print("Datos del vehículo :" + vehiculo1.getMatricula() + ", " + vehiculo1.getMarca());
//
//        System.out.print("Datos del vehículo mi cacharro:" + miCacharro.getMatricula() + ", " + miCacharro.getMarca());
//
//        miCacharro.setMatricula("2932 ASD");
//        System.out.println("Matricula mi cacharro cambiada: " + miCacharro.getMatricula());
    }

}
