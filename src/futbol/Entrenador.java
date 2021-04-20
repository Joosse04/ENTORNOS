/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

/**
 *
 * @author xJose04
 */
public class Entrenador {
    /**
    * Campos de la clase
    */
     private String nombre;
     private int edad;
     private String nacionalidad;
     private int añosDeExperiencia;
     private String equipoEntrena;

    /**
    * Constructor
    */
    public Entrenador(String nombre, int edad, String nacionalidad, int añosDeExperiencia, String equipoEntrena) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.añosDeExperiencia = añosDeExperiencia;
        this.equipoEntrena = equipoEntrena;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public String getEquipoEntrena() {
        return equipoEntrena;
    }

    public void setEquipoEntrena(String equipoEntrena) {
        this.equipoEntrena = equipoEntrena;
    }
     
    /**
    * Método que devuelve quien es el entrenador de cada equipo
    */
    public String dirigirEquipo() {
        return getNombre()+" es el entrenador del  "+ getEquipoEntrena();
    }
    
    /**
    * Método que devuelve quien es el mejor entrenador de un equipo
    */
    public String buenEntrenador() {
        return getNombre()+" con "+getAñosDeExperiencia()+ " años de experiencia como entrenador ha sido nombrado el mejor entrenador del "+getEquipoEntrena();
    }
     
     
}
