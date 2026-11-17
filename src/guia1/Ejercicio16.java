package guia1;

import javax.swing.JOptionPane;

<<<<<<< HEAD
public class Ejercicio16{
    public void SumaImpar(){
=======
public class Ejercicio16 {
    public void SumaImpar() {
>>>>>>> c6a3061d75ecc5f3f89b3bee623da34fa4afbbea
        int suma = 0;
        
        for (int i = 1; i <= 50; i += 2) {
            suma += i;
        }
        
        JOptionPane.showMessageDialog(null, "La suma de los números impares del 1 al 50 es: " + suma);
    }
}