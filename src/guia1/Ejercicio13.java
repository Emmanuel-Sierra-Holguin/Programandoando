package guia1;

import javax.swing.JOptionPane;

public class Ejercicio13 {
    
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if ( i % 2 == 0) {  
                JOptionPane.showMessageDialog(null, "El siguiente número par es: " + i);
            }
        }
        
    }
}
