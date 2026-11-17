package guia1;

import javax.swing.JOptionPane;

public class Ejercicio9 {
<<<<<<< HEAD
     public  void Login(){
         String usuario = "admin";
         String contraseña = "1234";
=======
    public void Login() {
     
        String usuarioCorrecto = "admin";
        String passwordCorrecto = "1234";
>>>>>>> c6a3061d75ecc5f3f89b3bee623da34fa4afbbea

        
        String usuarioIngresado = JOptionPane.showInputDialog("Ingrese su usuario:");
        if (usuarioIngresado == null) return;

        String passwordIngresado = JOptionPane.showInputDialog("Ingrese su contraseña:");
        if (passwordIngresado == null) return; 

       
        if (usuarioIngresado.equals(usuarioCorrecto) && passwordIngresado.equals(passwordCorrecto)) {
            JOptionPane.showMessageDialog(null, "¡Bienvenido!");
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
        }
    }
}