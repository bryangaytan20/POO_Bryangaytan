/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author danie
 */
public class Audifonos {
     private String marca;
    private double precio;
    private String color;
    
     public Audifonos(String mar,double pre,String col){
        this.marca = mar;
        this.precio = pre;
        this.color = col;
    }
     public String getMarca (){
     
     return this.marca;
     }
     public void setMarca (String mar){
         this.marca = mar;
     }
     public double getPrecio (){
     
     return this.precio;
     } 
    public void setPrecio (double pre){
         this.precio = pre;
     } 
     public String getColor (){
     
     return this.color;
     }
     public void setColor (String col){
         this.color = col;
     }
}
