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
public class Chef extends Cocinero {
    private String especialidad;
    private int numero_recetas;
    private int numero_reconocimientos;
    
    
 public Chef(){
     super();
 }
 
 public Chef(String nombre, int edad, int anios_experiencia,
         String labor_en_cocina, String especialidad,int numero_recetas,int numero_reconocimientos){
     super(nombre,edad,anios_experiencia,labor_en_cocina);
     this.especialidad = especialidad;
     this.numero_recetas = numero_recetas;
     this.numero_reconocimientos = numero_reconocimientos;
 }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the numero_recetas
     */
    public int getNumero_recetas() {
        return numero_recetas;
    }

    /**
     * @param numero_recetas the numero_recetas to set
     */
    public void setNumero_recetas(int numero_recetas) {
        this.numero_recetas = numero_recetas;
    }

    /**
     * @return the numero_reconocimientos
     */
    public int getNumero_reconocimientos() {
        return numero_reconocimientos;
    }

    /**
     * @param numero_reconocimientos the numero_reconocimientos to set
     */
    public void setNumero_reconocimientos(int numero_reconocimientos) {
        this.numero_reconocimientos = numero_reconocimientos;
    }
    
}


