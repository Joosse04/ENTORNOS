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
     private int a�osDeExperiencia;
     private String equipoEntrena;

    /**
    * Constructor
    */
    public Entrenador(String nombre, int edad, String nacionalidad, int a�osDeExperiencia, String equipoEntrena) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.a�osDeExperiencia = a�osDeExperiencia;
        this.equipoEntrena = equipoEntrena;
    }
    
    /**
    * M�todos Getter y Setter
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

    public int getA�osDeExperiencia() {
        return a�osDeExperiencia;
    }

    public void setA�osDeExperiencia(int a�osDeExperiencia) {
        this.a�osDeExperiencia = a�osDeExperiencia;
    }

    public String getEquipoEntrena() {
        return equipoEntrena;
    }

    public void setEquipoEntrena(String equipoEntrena) {
        this.equipoEntrena = equipoEntrena;
    }
     
    /**
    * M�todo que devuelve quien es el entrenador de cada equipo
    */
    public String dirigirEquipo() {
        return getNombre()+" es el entrenador del  "+ getEquipoEntrena();
    }
    
    /**
    * M�todo que devuelve quien es el mejor entrenador de un equipo
    */
    public String buenEntrenador() {
        return getNombre()+" con "+getA�osDeExperiencia()+ " a�os de experiencia como entrenador ha sido nombrado el mejor entrenador del "+getEquipoEntrena();
    }
     
     
}
