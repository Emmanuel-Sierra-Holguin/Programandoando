package guia1;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public void CajaRegistradora() {
<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);
=======
        String input = JOptionPane.showInputDialog("Ingrese el precio del producto:");
        
        if (input == null) return; 
>>>>>>> c6a3061d75ecc5f3f89b3bee623da34fa4afbbea

        double precio = Double.parseDouble(input);
        double descuento = 0;
        double total = 0;

        if (precio > 500000) {
            descuento = precio * 0.20;
            total = precio - descuento;
            JOptionPane.showMessageDialog(null, "Al precio $" + (int)precio + ", se le aplica descuento: 20% y el total sería: $" + (int)total);
        } else if (precio > 200000) {
            descuento = precio * 0.15;
            total = precio - descuento;
            JOptionPane.showMessageDialog(null, "Al precio $" + (int)precio + ", se le aplica descuento: 15% y el total sería: $" + (int)total);
        } else if (precio > 100000) {
            descuento = precio * 0.10;
            total = precio - descuento;
            JOptionPane.showMessageDialog(null, "Al precio $" + (int)precio + ", se le aplica descuento: 10% y el total sería: $" + (int)total);
        } else {
            JOptionPane.showMessageDialog(null, "Al precio $" + (int)precio + " no se le aplica descuento. Total: $" + (int)precio);
        }
    }
}