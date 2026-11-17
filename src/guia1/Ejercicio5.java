package guia1;

import javax.swing.JOptionPane;

public class Ejercicio5 {
    public void IngresoDatos() {
    
    int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año: "));

        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            JOptionPane.showMessageDialog(null, "El año " + anio + " es bisiesto.");
        }
         else {
            JOptionPane.showMessageDialog(null, "El año " + anio + " no es bisiesto.");
        }
    };
};

