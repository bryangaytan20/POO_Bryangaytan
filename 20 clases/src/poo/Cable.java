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
public class Cable {
    private String marca;
    private double precio;
    private String tamanio;
    
     public Cable(String mar,double pre,String tam){
        this.marca = mar;
        this.precio = pre;
        this.tamanio = tam;
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
     public String getTamanio (){
     
     return this.tamanio;
     }
     public void setTamanio (String tam){
         this.tamanio = tam;
     }
}
