/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;

import javax.swing.JOptionPane;

/**
 *
 * @author Eryan
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        // "un if necesita una expresion boooleana"
        if (true) {
            JOptionPane.showMessageDialog(null, "El if dijo que si xd");
        }
        int i=0;
         if (i==0) {
            JOptionPane.showMessageDialog(null, "i es igual a 0");
        }
          if (i==1) {
            JOptionPane.showMessageDialog(null, "i no es igual a 0");
        }
          
          */
        
        
        /* no lo pude terminar de copiar
        String var1 = "Hola1";
        String var2 = "Hola2";  
        String var3 = "Hola3";  
          
          if (var1==var2){
             JOptionPane.showMessageDialog(null,"Son iguales.");
          }
          */
        
        
        //ejemplo de que alguien cin 15 años no puede tomar cocacola
          int edad = 14;
          if (edad!=15){
              JOptionPane.showMessageDialog(null, "Puede tomar cocacola");
          }  
          
          if (edad< 15 || edad > 15){
              JOptionPane.showMessageDialog(null, "Puede tomar cocacola");
          }
          
          String user= "usuario1";
          String pwd="12356";
                  
         if (user.compareTo("usuario1")==0 && pwd.equals("123456"))
          JOptionPane.showMessageDialog(null, "Si son iguales");
          
          
    }
    
}
