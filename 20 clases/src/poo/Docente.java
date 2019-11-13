/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author bryan
 */
public class Docente extends Persona {
    
    private String materia;
    private int matricula;

    
    public Docente (){
        super ();
    }
    
    public Docente(String nombre,int edad,double estatura,
            double peso,String sexo, String materia, int matricula){
        super(nombre,edad,estatura,peso,sexo);
        this.materia =materia;
        this.matricula =matricula; 
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}



