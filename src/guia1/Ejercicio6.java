package guia1;

import javax.swing.JOptionPane;

public class Ejercicio6 {
    public void IngresoDatos() {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota de 0 a 100: "));

        if (nota >= 90 && nota <= 100) {
            JOptionPane.showMessageDialog(null, "Exelente.");
        } else if (nota >= 80 && nota < 90) {
            JOptionPane.showMessageDialog(null, "Bueno");
        } else if (nota >= 70 && nota < 80) {
            JOptionPane.showMessageDialog(null, "Aceptable");
        } else if (nota >= 60 && nota < 70) {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        } else if (nota >= 0 && nota < 60) {
            JOptionPane.showMessageDialog(null, "Reprobado");
        } else {
            JOptionPane.showMessageDialog(null, "Nota inválida. Ingrese un valor entre 0 y 100.");
        }

    }
    
}
