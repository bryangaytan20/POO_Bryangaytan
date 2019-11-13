/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframecalculadora;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

public class JButtonC extends JButton{
    //Etiquera(texto).
    //Tamaño.
    //Color.
    public JButtonC(String etiqueta, Dimension dim, Color color){
        super(etiqueta);
        setSize(dim);
        
        Font aux = getFont();
        String fuente = aux.getName();
        int estilo = aux.getStyle();
        Font aux2 = new Font(fuente, estilo, 50);
        setFont (aux2);
 
        //Color
        setBackground(color);
       
        
    }
    
}
