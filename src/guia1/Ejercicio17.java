package guia1;

import javax.swing.JOptionPane;

<<<<<<< HEAD
public class Ejercicio17{
    public void TablaMultiplicar(){
        System.out.println("--TABLA DE MULTIPLICACION");
        for(int i = 0; i <= 10; i++){
            int resultado = 7 * i;
            System.out.println("7 x " + i + " = " + resultado);
=======
public class Ejercicio17 {
    public void TablaMultiplicar() {
        String resultado = "-- TABLA DE MULTIPLICACIÓN --\n";
        
        for (int i = 0; i <= 10; i++) {
            int calc = 7 * i;
            resultado += "7 x " + i + " = " + calc + "\n";
>>>>>>> c6a3061d75ecc5f3f89b3bee623da34fa4afbbea
        }
        
        JOptionPane.showMessageDialog(null, resultado);
    }
}