/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author bryan
 */
public class Cocinero {
    private String nombre;
    private int edad;
    private int anios_experiencia;
    private String labor_en_cocina;
    
    public Cocinero(){
    
    }

    public Cocinero(String nombre, int edad, int anios_experiencia, String labor_en_cocina) {
        this.nombre = nombre;
        this.edad = edad;
        this.anios_experiencia = anios_experiencia;
        this.labor_en_cocina = labor_en_cocina;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the anios_experiencia
     */
    public int getAnios_experiencia() {
        return anios_experiencia;
    }

    /**
     * @param anios_experiencia the anios_experiencia to set
     */
    public void setAnios_experiencia(int anios_experiencia) {
        this.anios_experiencia = anios_experiencia;
    }

    /**
     * @return the labor_en_cocina
     */
    public String getLabor_en_cocina() {
        return labor_en_cocina;
    }

    /**
     * @param labor_en_cocina the labor_en_cocina to set
     */
    public void setLabor_en_cocina(String labor_en_cocina) {
        this.labor_en_cocina = labor_en_cocina;
    }
}
 

    

