/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicasorpresa;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Listenerbotones implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton_p aux = (JButton_p) e.getSource();
        
        if("default".equals(aux.getText())){
             JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo por defecto.", "cuidado", JOptionPane.DEFAULT_OPTION);
        }
        if("Information".equals(aux.getText())){
             JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo informativo.", "cuidado", JOptionPane.INFORMATION_MESSAGE);
        }
        if("warning".equals(aux.getText())){
             JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo de advertencia.", "cuidado", JOptionPane.WARNING_MESSAGE);
        }
        if("fail".equals(aux.getText())){
             JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo de errores.", "cuidado", JOptionPane.ERROR_MESSAGE);  
        }
        if("question".equals(aux.getText())){
             JOptionPane.showMessageDialog(aux, "Este es un cuadro de diálogo de pregunta.", "cuidado", JOptionPane.QUESTION_MESSAGE);   
        }
        

    }
    
}
