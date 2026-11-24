package guia2;

import javax.swing.JOptionPane;

import guia2.JavAirlines.Controller.LoginController;
import guia2.JavAirlines.Controller.VueloController;
import guia2.JavAirlines.Model.ConexionDB;
import guia2.JavAirlines.Model.Usuario;
import guia2.JavAirlines.Model.UsuarioDAO;
import guia2.JavAirlines.Model.VueloDAO;

public class MainPersistenciaData {
    public void MenuBaseDeDatos() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresando A Ejercicios Base De Datos \n" +
                "1.Actividad 3.3 Guia 2 Crear Base de Ejemplo \n" +
                "2.Actividad 3.4 Creando Sistema Con Login"));

        if (opcion == 1) {
            ConexionDB crearTabDb = new ConexionDB();
            crearTabDb.createTables();
            JOptionPane.showMessageDialog(null, "Base de datos de ejemplo creada exitosamente (javairlines.db)");
        }

        if (opcion == 2) {
            ConexionDB.createTables();
            VueloDAO.insertarDatosIniciales();
            new UsuarioDAO().insertarUsuarioSiNoExiste();

            LoginController loginController = new LoginController();
            while (true) {
                Usuario usuarioActivo = loginController.iniciarSesion();
                if (usuarioActivo == null) {
                    break;
                }

                VueloController vueloController = new VueloController(usuarioActivo);
                vueloController.iniciar();
                loginController.cerrarSesion();
            }
        }
    }
}