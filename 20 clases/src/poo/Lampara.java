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
public class Lampara {
    private String marca;
    private double lm;
    private double precio;

    public Lampara() {
    }

    public Lampara(String marca, double lm, double precio) {
        this.marca = marca;
        this.lm = lm;
        this.precio = precio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the lm
     */
    public double getLm() {
        return lm;
    }

    /**
     * @param lm the lm to set
     */
    public void setLm(double lm) {
        this.lm = lm;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
}
 
