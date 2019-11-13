/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasorpresa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class Practicaespecial extends JFrame {
    
    public static void main(String[] args) {
       Practicaespecial ex = new Practicaespecial();
       ex.setVisible(true);
       ex.setSize(400, 1000);
    }
    
    public Practicaespecial() {
        inicializarComponentes();
        
    }
    
    public void inicializarComponentes(){
        JPanel botones = new JPanel(new GridLayout(5, 1));
        Dimension dim = new Dimension(10,10);
        
        JButton def = new JButton_p("default", dim, Color.red);
        JButton info = new JButton_p("Information", dim, Color.blue);
        JButton war = new JButton_p("warning", dim, Color.red);
        JButton error = new JButton_p("fail", dim, Color.blue);
        JButton que = new JButton_p("question", dim, Color.red);
       
        
        botones.add(def);
        botones.add(info);
        botones.add(war);
        botones.add(error);
        botones.add(que);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BorderLayout());
        add(botones, BorderLayout.CENTER);
        
        Listenerbotones orejon = new Listenerbotones();
        def.addActionListener(orejon);
        info.addActionListener(orejon);
        war.addActionListener(orejon);
        error.addActionListener(orejon);
        que.addActionListener(orejon);
        
    }
    
    
    
    
}
