package numeroMayor2;

import javax.swing.JOptionPane;

public class numeroMayor2 {
    public static void main(String[] args) {
        
        // Declaración de variables
        int X, Y, Z;
        

        // input
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite X: "));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite Y: "));
        Z = Integer.parseInt(JOptionPane.showInputDialog("Digite Z: "));
        
        // processing
        if (X>Y & X>Z)
        {
            JOptionPane.showMessageDialog(null, "X = " + X + " es el mayor número.");
        }else 
        {
            if (Y>X & Y>Z){

                JOptionPane.showMessageDialog(null,"Y = " + Y + " es el mayor número.");

            }

            else{

                if (Z>X & Z>Y){

                    JOptionPane.showMessageDialog(null,"Z = " + Z + " es el mayor número.");

                }else{

                    JOptionPane.showMessageDialog(null,"X = " + X +", Y = " + Y + " y" + " Z = " + Z + " son todos números iguales");

                }
            
            }            
        }
    }
}
