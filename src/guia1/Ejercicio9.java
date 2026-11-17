package guia1;



public class Ejercicio9 {
     public  void Login(){
         String usuario = "admin";
         String contraseña = "1234";

         if(usuario.equals("admin") && contraseña.equals("1234")){
            System.out.print("Bienvenido");
         }
         else{
            System.out.print("Credenciales incorrectas");
         }
     }
    
}
