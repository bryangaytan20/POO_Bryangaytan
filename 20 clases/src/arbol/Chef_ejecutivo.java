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
public class Chef_ejecutivo extends Chef {
    private int numero_chefs;
    private int sueldo;
    private int menus_creados;
    
    
    public Chef_ejecutivo (){
        super();
    }
    
    public Chef_ejecutivo(String nombre, int edad, int anios_experiencia, String labor_en_cocina,
                          String especialidad,int numero_recetas,
                          int numero_reconocimientos, int numeros_chefs,
                          int sueldo,int menus_creados){
        super(nombre,edad,anios_experiencia,labor_en_cocina,especialidad,numero_recetas,numero_reconocimientos);
        this.sueldo = sueldo;
        this.numero_chefs = numero_chefs;
        this.menus_creados = menus_creados;
        
    }

    /**
     * @return the numero_chefs
     */
    public int getNumero_chefs() {
        return numero_chefs;
    }

    /**
     * @param numero_chefs the numero_chefs to set
     */
    public void setNumero_chefs(int numero_chefs) {
        this.numero_chefs = numero_chefs;
    }

    /**
     * @return the sueldo
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the menus_creados
     */
    public int getMenus_creados() {
        return menus_creados;
    }

    /**
     * @param menus_creados the menus_creados to set
     */
    public void setMenus_creados(int menus_creados) {
        this.menus_creados = menus_creados;
    }
    
}
