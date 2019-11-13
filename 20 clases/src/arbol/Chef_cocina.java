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
public class Chef_cocina extends Chef{
    private int num_trabajadores;
    
    
    public Chef_cocina (){
        super();
    }
    
    public Chef_cocina(String nombre, int edad, int anios_experiencia, String labor_en_cocina,
                          String especialidad,int numero_recetas,
                          int numero_reconocimientos,int num_trabajadores){
        
        super(nombre,edad,anios_experiencia,labor_en_cocina,especialidad,numero_recetas,numero_reconocimientos);
        this.num_trabajadores = num_trabajadores;
    }

    /**
     * @return the num_trabajadores
     */
    public int getNum_trabajadores() {
        return num_trabajadores;
    }

    /**
     * @param num_trabajadores the num_trabajadores to set
     */
    public void setNum_trabajadores(int num_trabajadores) {
        this.num_trabajadores = num_trabajadores;
    }
    
}
