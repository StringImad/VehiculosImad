/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imad.proyectovehiculosimad;

import java.util.Random;

/**
 *
 * @author MSI
 */
public class Vehiculo {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public Vehiculo() {

        marca = enumAleatorioMarcas();
        modelo = enumAleatorioModelo();
        color = enumAleatorioColores();
    }

    public String enumAleatorioMarcas() {
        int numeroAleatorio = new Random().nextInt(Marcas.values().length);
        return Marcas.values()[numeroAleatorio].name();
    }

    public String enumAleatorioModelo() {
        int numeroAleatorio = new Random().nextInt(Modelos.values().length);
        return Modelos.values()[numeroAleatorio].name();
    }

    public String enumAleatorioColores() {
        int numeroAleatorio = new Random().nextInt(Colores.values().length);
        return Colores.values()[numeroAleatorio].name();
    }

    // el método constructor de la clase Vehiculo 
    public Vehiculo(String matricula,
            String marca, String modelo, String color, double tarifa) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = false;
    }
// los métodos ‘get’ y ‘set’ de la clase Vehiculo 

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tarifa=" + tarifa + ", disponible=" + disponible + '}';
    }

    public String toStringCorto() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }

}
