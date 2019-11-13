/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatoCalculadora;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class gatoCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        
        ArrayList aux = new ArrayList();
        aux.add(3.4);
        aux.add(5);
       
        c1.setOperador(aux);
        
        c1.suma(aux);
        System.out.println(c1.getResultado());

//        Gato gatito = new Gato();
//        
//        gatito.setTurno(1);
//        gatito.setPosX(0);
//        gatito.setPosY(0);
//        
//        gatito.game();
//        System.out.println(gatito.getTablero());
    }
    
}
