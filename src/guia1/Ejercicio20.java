package src.guia1;

import javax.swing.JOptionPane;

public class Ejercicio20 {
    public void numerosDivisibles() {
        int numeroActual = 1;
        String resultado = "";

        while (numeroActual <= 100) {
            if ((numeroActual % 3 == 0) && (numeroActual % 5 == 0)) {
                resultado += numeroActual + " ";
            }
            numeroActual++;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
