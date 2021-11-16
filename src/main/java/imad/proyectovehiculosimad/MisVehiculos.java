/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.proyectovehiculosimad;

/**
 *
 * @author MSI
 */
public class MisVehiculos {

    public static void main(String args[]) {

// este programa crea un objeto de la clase vehiculo y
// muestra sus atributos
// instanciación del objeto vehiculo1
        Vehiculo vehiculo1 = new Vehiculo("4050 ABJ", "VW", "GTI", "Blanco",
                100.0);

// invocación de métodos para mostrar los datos del objeto vehiculo1
        System.out.print("Datos del vehículo :" + vehiculo1.getMatricula() + ", " + vehiculo1.getMarca()
        );

    }

}
