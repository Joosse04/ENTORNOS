/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import java.time.LocalDate;

/**
 *
 * @author xJose04
 */
public class Jugador {
    /**
    * Campos de la clase
    */
    private String nombreCompleto;
    private double altura;
    private double peso;
    private String pais;
    private LocalDate fechaNacimiento;
    private String posicion;
    private int dorsal;

    /**
    * Constructor
    */ 
    public Jugador(String nombreCompleto, double altura, double peso, String pais, LocalDate fechaNacimiento, String posicion, int dorsal) {
        this.nombreCompleto = nombreCompleto;
        this.altura = altura;
        this.peso = peso;
        this.pais = pais;
        this.fechaNacimiento = fechaNacimiento;
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    /**
    * Métodos Getter y Setter
    */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    /**
    * Método que te devuelve que futbolista tiene el balón
    */
    public String correr(){ 						
        return "Corriendo con el balón va " + nombreCompleto;					
    }		
    
    /**
    * Método que te devuelve si un futbolista mete gol, lo falla o le quitan el balón
    */
    public String chutar(int n){ 
        while(n!=0) {
            if (n%2==0) {
                return "Chuta "+nombreCompleto+" y... ¡Gol!";
            }
            else {
                return "Chuta "+nombreCompleto+" y... ¡la para el portero!";
            }
        }
        return "Le quitan el balon a "+nombreCompleto;
    }	
}
