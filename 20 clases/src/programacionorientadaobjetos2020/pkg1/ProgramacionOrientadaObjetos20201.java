/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos2020.pkg1;










import gui.NuevoJFrame;
import java.awt.Color;
import javax.swing.JFrame;
import poo.Audifonos;
import poo.Bocina;
import poo.Cable;
import poo.Cancion;
import poo.Cartera;
import poo.Celular;
import poo.Gato;
import poo.Lapiz;
import poo.Laptop;
import poo.Lentes;
import poo.Lonchera;
import poo.Perfume;
import poo.Perro;
import poo.Persona; 
import poo.Tenis;
import poo.Yoghurt;



/**
 *
 * @author danie
 */
public class ProgramacionOrientadaObjetos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NuevoJFrame aux = new NuevoJFrame("Mi nuevo JFrame ", 400, 600);
        JFrame aux2 = new JFrame("Mi nuevo JFrame 2");
        aux2.setSize(600, 400);
        aux2.setVisible(true);
        aux.setBackground (new Color(122, 32, 85));
        
        
        
        Persona beto = new Persona("Skabe", 19, 1.8, 92, "Masculino");
  
        System.out.println();
        
        Gato persa = new Gato("baguera", 1, "esfinge");
        persa.nombre="maqui";
        
        Audifonos xiaomi = new Audifonos("sony", 4500, "negros");
        xiaomi.setMarca("sony");
        System.out.println(xiaomi.getMarca());
        xiaomi.setPrecio(5000);
        System.out.println(xiaomi.getPrecio());
        xiaomi.setColor("rojos");
        System.out.println(xiaomi.getColor());
        
        
        Cable mobo = new Cable("mobo", 100, "tres metros");
        mobo.setMarca("Adata");
        System.out.println(mobo.getMarca());
        mobo.setPrecio(80);
        System.out.println(mobo.getPrecio());
        mobo.setTamanio("tres metros");
        System.out.println(mobo.getTamanio());
        
        
        Celular motorola = new Celular("motorola", 3500, "blanco");
        motorola.marca = "motorola";
        
        Lapiz amarillo = new Lapiz("baco", 2, "amarillo");
        amarillo.color = "negro";
        
        Laptop gamer = new Laptop("dell", 13000, "plata");
        gamer.marca = "hp";
        
        Lentes negros = new Lentes("ockley", 410, "de sol");
        negros.precio = 620;
        
        Lonchera chica = new Lonchera("jairo", 230, "verde menta");
        chica.color = "morado";
        
        Bocina grande = new Bocina("JBL", 6000, "rojo");
        grande.setMarca("Bose");
        System.out.println(grande.getMarca());
        grande.setPrecio(4500);
        System.out.println(grande.getPrecio());
        grande.setColor("Negro");
        System.out.println(grande.getColor());
        
        Cartera piel = new Cartera("azteca", 150, "chica");
        piel.setMarca("xiaomi");
        System.out.println(piel.getMarca());
        piel.setPrecio(300);
        System.out.println(piel.getPrecio());
        piel.setMedida("s");
        System.out.println(piel.getMedida());
        
        
        Perfume nautica = new Perfume("nautica", 800, 100);
        nautica.precio = 640;
        
        Perro cafe = new Perro("roberto", 5,"chihuahua");
        cafe.nombre = "rocky";
        
        Tenis deportivos = new Tenis("adidas", 950, 8);
        deportivos.marca = "puma";
        
        Yoghurt lala = new Yoghurt("lala", "fresa", 45);
        lala.gramos = 30;
        
        Cancion oasis = new Cancion("wonderwall", 6.42, "rock");
        oasis.setNombre("yesterday");
        System.out.println(oasis.getNombre());
        oasis.setDuracion(3.50);
        System.out.println(oasis.getDuracion());
        oasis.setGenero("rock clasico");
        System.out.println(oasis.getGenero());
        
        
        
        
        
    System.out.println();
               
        
        
       
        

         
        
    }
    
  
    }
    

