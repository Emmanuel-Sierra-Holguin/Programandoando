import javax.swing.JOptionPane;
import ConexionDb.InicializarDB;
import guia2.JavAirlines.Controller.LoginController;
import guia2.JavAirlines.Controller.VueloController;
import guia2.JavAirlines.Model.Usuario;
import guia2.JavAirlines.Model.VueloDAO;
import guia1.guiaMain;
import guia2.guia2Main;

public class Main {
    public static void main(String[] args) {
        InicializarDB.crearTablas();
        int opcion = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Bienvenido A Programando Ando \n" +
                        "Aqui Aprenderas Java  \n" +
                        "Ingrese una opcion para El Programa\n" +
                        "1.Ejercicio Guia 1\n" +
                        "2.Ejercicios Guia 2\n" +
                        "3.Inicializar Base de Datos\n"+
                         "4.login y Gestion de vuelo"));


        if (opcion == 1) {
            System.out.println("Ingresando A Ejercicios Guia 1");
            guiaMain guia1 = new guiaMain();
            guia1.Guia1();
        }
         if (opcion == 2) {
            System.out.println("Ingresando A Ejercicios Guia 2");
            guia2Main guia2 = new guia2Main();
            guia2.Guia2();
        }
        if (opcion == 3) {
        System.out.println("Inicializando Base de Datos...");
        InicializarDB.crearTablas();
        }
        
        if (opcion == 4) {
            // Asegura la carga inicial de vuelos antes de abrir el controlador
            VueloDAO.insertarDatosIniciales();

            LoginController loginController = new LoginController();
            Usuario usuarioActivo = loginController.iniciarSesion();

            if (usuarioActivo != null) {
                VueloController vueloController = new VueloController(usuarioActivo);
                vueloController.iniciar();
                loginController.cerrarSesion();
            }
        }
    }
}
