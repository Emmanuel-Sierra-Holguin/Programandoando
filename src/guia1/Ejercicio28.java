package guia1;

import javax.swing.JOptionPane;

public class Ejercicio28{
    public static void main(String[] args){
        

        for(int i = 1; i <= 20; i++ ){
            int cubo = i * i * i;
            resultado += "El cubo de " + i + " es: " + cubo + "\n";
        }

       
        JOptionPane.showMessageDialog(null, resultado);
    }
}