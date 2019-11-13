/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Alumno
 */
public class Cancion {
     private String nombre;
    private double duracion;
    private String genero;
    

 public Cancion (String nom,double dur,String gen){
        this.nombre = nom;
        this.duracion = dur;
        this.genero = gen;
    }
 public String getNombre (){
     return this.nombre;
 }
 public void setNombre (String nom){
     this.nombre = nom;
 }
  public double getDuracion (){
     return this.duracion;
 }
 public void setDuracion (double dur){
     this.duracion = dur;
 }
  public String getGenero (){
     return this.genero;
 }
 public void setGenero (String gen){
     this.genero = gen;
 }
}


