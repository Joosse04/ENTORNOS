/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import java.util.ArrayList;

/**
 *
 * @author xJose04
 */
public class Equipo {
    /**
    * Campos de la clase
    */
    private String nombre;
    private int jugadores;
    private String liga;
    private String estadio;
    private int titulos;

    /**
    * Constructor
    */
    public Equipo(String nombre, int jugadores, String liga, String estadio, int titulos) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.liga = liga;
        this.estadio = estadio;
        this.titulos = titulos;
    }
    
    /**
    * Métodos Getter y Setter
    */
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getJugadores() {
        return jugadores;
    }

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public String getLiga() {
        return liga;
    }

    public void setLiga(String liga) {
        this.liga = liga;
    }
    
    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }
    
    /**
    * Método que devuelve cuantos puntos tiene un equipo en la liga
    */
    public String calcularPuntosEnLiga(int partidosGanados, int partidosEmpatados) {
        return "El "+getNombre()+" tiene "+(partidosGanados * 3 +partidosEmpatados)+" puntos en la liga";
    }

    /**
    * Método que devuelve si un equipo ha ganado o no un partido
    */
    public String partido(int golesLocal, int golesVisitante) {
        String resultado = "";
        if (golesLocal > golesVisitante)
        {
            resultado = "Victoria del "+getNombre();
        }
        else if (golesVisitante > golesLocal)
        {
            resultado = "Derrota del "+getNombre();
        }
        else {
            resultado = "Empate del "+getNombre();
        }
        return resultado;
    }
    public String titulosObtenidos() {
        return "El "+getNombre()+" ha conseguido "+getTitulos()+" títulos a lo largo de toda su historia";
    }
}
