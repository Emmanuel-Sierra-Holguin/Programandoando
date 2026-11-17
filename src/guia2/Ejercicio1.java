package guia2 ;

import javax.swing.JOptionPane;

/*
Objetivo -> Capturar errores de formato numérico y división entre cero en una operación simple.
Excepciónes trabajadas -> NumberFormatException | ArithmeticException.

El usuario ingresa dos números enteros. El programa calcula la división. Se deben capturar dos errores posibles: 
que el texto ingresado no sea un número válido, y que el divisor sea cero.

*/

public class Ejercicio1 {

    public void DivisionEnteraBasica () {

        JOptionPane.showMessageDialog(null, 
    "=========================================\n" +
    "== Ingreso al Ejercicio 1 de la Guia 2 ==\n" +
    "=========================================");

        try {

        	int a = Integer.parseInt(
                JOptionPane.showInputDialog("Dividendo:"));

        	int b = Integer.parseInt(
                JOptionPane.showInputDialog("Divisor:"));

            JOptionPane.showMessageDialog(null,
            	"Resultado: " + (a / b));

    	} catch (NumberFormatException e) {
        	JOptionPane.showMessageDialog(null,
            	"Error: ingresa solo numeros enteros.");

    	} catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null,
            	"Error: no se puede dividir entre cero.");
    	}


    }
}
