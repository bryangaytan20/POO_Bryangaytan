
package jframecalculadora;
import java.awt.BorderLayout;
import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.PINK;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Files;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameCalculadora extends JFrame{

    public static void main(String[] args) {
        JFrameCalculadora C = new JFrameCalculadora();
        C.setVisible(true);
        C.setSize(600, 800);
    }
    
    public JFrameCalculadora() {
        inicializarComponentes();
        //setIconImage("C:/Users/usuario/Documents/UPIIZ/3ER SEM/POO/JFrameCalculadora/src/jimmyPelon");
    }

    private void inicializarComponentes(){
        //Crear el componenete de la parte central
        JPanel panelCentral = new JPanel(new GridLayout(5,4));
        Dimension dim = new Dimension(30,30);
        //Creacion de botones
        JButtonC btnC = new JButtonC("C", dim, Color.red);
        JButtonC btnCE = new JButtonC("CE", dim, Color.red);
        JButtonC btnMM = new JButtonC("+/-", dim, Color.blue);
        JButtonC btnMulti = new JButtonC("*", dim, Color.orange);
        JButtonC btn7 = new JButtonC("7", dim, Color.blue);
        JButtonC btn8 = new JButtonC("8", dim, Color.blue);
        JButtonC btn9 = new JButtonC("9", dim, Color.blue);
        JButtonC btnDiv = new JButtonC("/", dim, Color.orange);
        JButtonC btn4 = new JButtonC("4", dim, Color.blue);
        JButtonC btn5 = new JButtonC("5", dim, Color.blue);
        JButtonC btn6 = new JButtonC("6", dim, Color.blue);
        JButtonC btnMinus = new JButtonC("-", dim, Color.orange);
        JButtonC btn1 = new JButtonC("1", dim, Color.blue);
        JButtonC btn2 = new JButtonC("2", dim, Color.blue);
        JButtonC btn3 = new JButtonC("3", dim, Color.blue);
        JButtonC btnPlus = new JButtonC("+", dim, Color.orange);
        JButtonC btn0 = new JButtonC("0", dim, Color.blue);
        JButtonC btnPoint = new JButtonC(".", dim, Color.orange);
        JButtonC btnEquals = new JButtonC("=", dim, Color.orange);
        JButtonC btnAcerca = new JButtonC("?", dim, Color.green);
        
        panelCentral.add(btnC);
        panelCentral.add(btnCE);
        panelCentral.add(btnMM);
        panelCentral.add(btnMulti);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
        panelCentral.add(btnDiv);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btnMinus);
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btnPlus);
        panelCentral.add(btn0);
        panelCentral.add(btnPoint);
        panelCentral.add(btnEquals);
        panelCentral.add(btnAcerca);
        
        setLayout(new BorderLayout());
        add(panelCentral, BorderLayout.CENTER);
        
        JTextField display = new JTextField();
        Font auxF = display.getFont();
        Font nueva = new Font(auxF.getName(), auxF.getStyle(), 40);
        display.setFont(nueva);
        
        add(display, BorderLayout.NORTH);
        
        display.setEditable(false);
        
        display.setHorizontalAlignment(JTextField.RIGHT);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              
        //Inicializar Listeners (No se está creando una clase, sólo se está sobreescribiendo el método de 
        //                          ActionListener)
        
        //Listeners ROSAS
        ActionListener listenerRosa = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                switch(e.getActionCommand()){
                    case("+/-"):{
                        display.setText("-" + display.getText());
                        break;
                    }
                    case("0"): {
                        display.setText(display.getText() + "0");
                        break;
                    }
                    case("1"): {
                        display.setText(display.getText() + "1");
                        break;
                    }
                    case("2"): {
                        display.setText(display.getText() + "2");
                        break;
                    }
                    case("3"): {
                        display.setText(display.getText() + "3");
                        break;
                    }
                    case("4"): {
                        display.setText(display.getText() + "4");
                        break;
                    }
                    case("5"): {
                        display.setText(display.getText() + "5");
                        break;
                    }
                    case("6"): {
                        display.setText(display.getText() + "6");
                        break;
                    }
                    case("7"): {
                        display.setText(display.getText() + "7");
                        break;
                    }
                    case("8"): {
                        display.setText(display.getText() + "8");
                        break;
                    }
                    case("9"): {
                        display.setText(display.getText() + "9");
                        break;
                    }
                }
            }
             
        };
        
        ActionListener listenerNaranja = new ActionListener() {
            float num1 = 0;
            float num2 = 0;
            float res = 0;
            
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(e.getActionCommand()){
                    case("."):{
                        display.setText(display.getText() + ".");
                        break;
                        
                    }
                    case("+"): {
                        num1 = Float.parseFloat(display.getText()) + num1;
                        display.setText(display.getText() + " + ");
                        break;
                    }
                    case("*"): {
                        num1 = Float.parseFloat(display.getText());
                        display.setText(display.getText() + " * ");
                        break;
                    }
                    case("-"): {
                        num1 = Float.parseFloat(display.getText()) - num1;
                        display.setText(display.getText() + " - ");
                        break;
                    }
                    case("/"): {
                        num1 = Float.parseFloat(display.getText());
                        display.setText(display.getText() + " / ");
                        break;
                    }
                    case("="): {
                        num1 = res;
                        display.setText(Float.toString(res));
                            
                        }
                        
                    }
                }
            
        }; //Pendientes las operaciones xdd
        
        ActionListener listenerRojo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch(e.getActionCommand()){
                    case("C"):{
                        display.setText(" ");
                    }
                    case("CE"):{
                        display.setText(" ");
                    }
                }
            }
        };
        
        btnMM.addActionListener(listenerRosa);
        btn0.addActionListener(listenerRosa);
        btn1.addActionListener(listenerRosa);
        btn2.addActionListener(listenerRosa);
        btn3.addActionListener(listenerRosa);
        btn4.addActionListener(listenerRosa);
        btn5.addActionListener(listenerRosa);
        btn6.addActionListener(listenerRosa);
        btn7.addActionListener(listenerRosa);
        btn8.addActionListener(listenerRosa);
        btn9.addActionListener(listenerRosa);
        
        btnPoint.addActionListener(listenerNaranja);
        btnPlus.addActionListener(listenerNaranja);
        btnMinus.addActionListener(listenerNaranja);
        btnMulti.addActionListener(listenerNaranja);
        btnDiv.addActionListener(listenerNaranja);
        btnEquals.addActionListener(listenerNaranja);
        
        btnC.addActionListener(listenerRojo);
        btnCE.addActionListener(listenerRojo);
        
        ActionListener listenerGrey = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Imagen imagen = new Imagen();
                JFrame jimmy = new JFrame("Jimmy Pelón");
                JPanel jim = new JPanel();
                
                jim.setSize(300, 300);
                jimmy.setSize(500,600);
                jim.add(imagen);
                jim.repaint();
                jimmy.setVisible(true); 
                jim.setVisible(true);
            }
        };
        
        btnAcerca.addActionListener(listenerGrey);
    }
 
    
}
