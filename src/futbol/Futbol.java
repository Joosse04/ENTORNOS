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
public class Futbol {

    /**
     * Clase para comprobar que los m�todos funcionan correctamente
     */
    public static void main(String[] args) {
        /**
        * Instanciaci�n de los jugadores
        */
        Jugador Messi = new Jugador("Messi", 1.75, 72, "Argentino", LocalDate.of(1987, 06, 24), "Delantero", 10);
        Jugador CR7 = new Jugador("Cristiano Ronaldo", 1.87, 83, "Portugues", LocalDate.of(1985, 02, 05), "Delantero", 7);
        Jugador Mbapp� = new Jugador("Killiam Mbapp�", 1.78, 73, "Franc�s", LocalDate.of(1998, 12, 20), "Delantero", 7);
        Jugador Neymar = new Jugador("Neymar", 1.75, 68, "Brasile�o", LocalDate.of(1992, 02, 05), "Delantero",10);
        /**
        * Instanciaci�n de los equipos
        */
        Equipo RealMadrid = new Equipo("Real Madrid", 23, "Santander", "Santiago Bernabeu", 92);
        Equipo Barcelona = new Equipo("Barcelona FC", 23, "Santander",  "Santiago Bernabeu", 91);
        Equipo PSG = new Equipo("Paris-Saint Germain", 23, "Francia Ligue 1", "Santiago Bernabeu", 42);
        /**
        * Instanciaci�n de los entrenadores
        */
        Entrenador Zidane = new Entrenador("Zinedine Zidane", 48, "Frances", 7, "Real Madrid");
        Entrenador Koeman = new Entrenador("Ronal Koeman", 57, "Holandes", 21, "Barcelona FC");
        Entrenador Pochettino = new Entrenador("Mauricio Pochettino", 49, "Argentino", 12, "Paris-Saint Germain");

        /**
        * C�digo para comprobar que los m�todos funcionan correctamente
        */
        System.out.println(Mbapp�.correr());
        System.out.println(Messi.chutar(5));
        System.out.println(Barcelona.calcularPuntosEnLiga(30,6));
        System.out.println(RealMadrid.partido(2, 3));
        System.out.println(Zidane.dirigirEquipo());
        System.out.println(Pochettino.buenEntrenador());
        System.out.println(PSG.titulosObtenidos());
    }

}
