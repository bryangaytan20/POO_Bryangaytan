/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatoCalculadora;

import java.util.ArrayList;

/**
 *
 * @author bryangaytan20
 * 
 */
public class Calculadora {
    private
    double resultado;
    private ArrayList<Double> operador;

 public Calculadora() {
    this.operador = new ArrayList<Double>();
    this.resultado = 0;
    }
    
 public double suma(ArrayList<Double> op){
     operador = op;
        
    for(int i = 0; i<op.size(); i++){
    resultado = op.get(i) + resultado;
        }
    return resultado;
    }
    
 public double resta(ArrayList<Double> op){
    op = this.operador;
        
     for(int i = 0; i<op.size(); i++){
     this.resultado = op.get(i) - this.resultado;
        }
    return this.resultado;
    }
    
public double multiplicacion(ArrayList<Double> op){
    op = this.operador;
        
    for(int i = 0; i<op.size(); i++){
     this.resultado = op.get(i) * this.resultado;
        }
     return this.resultado;
    }

    public double getResultado() {
        return resultado;
    }

    public ArrayList<Double> getOperador() {
        return operador;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    public void setOperador(ArrayList<Double> operador) {
        this.operador = operador;
    }
}
