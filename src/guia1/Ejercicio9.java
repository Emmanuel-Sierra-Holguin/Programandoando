package guia1;

import java.util.Scanner;

public class Ejercicio9 {
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String usuario = "admin";
         String contraseña = "1234";

         if(usuario.equals("admin") && contraseña.equals("1234")){
            System.out.print("Bienvenido");
         }
         else{
            System.out.print("Credenciales incorrectas");
         }
         sc.close();
     }
    
}
