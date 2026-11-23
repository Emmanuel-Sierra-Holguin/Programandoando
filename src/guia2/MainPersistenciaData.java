package guia2;

import javax.swing.JOptionPane;

import guia2.JavAirlines.Controller.LoginController;
import guia2.JavAirlines.Model.ConexionDB;
import guia2.JavAirlines.Model.InsertarData;

public class MainPersistenciaData {
    public void MenuBaseDeDatos() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresando A Ejercicios Base De Datos \n" +
                "1.Actividad 3.3 Guia 2 Crear Base de Ejemplo \n" +
                "2.Actividad 3.4 Creando Sistema Con Login"));

        if (opcion == 1) {
            ConexionDB crearTabDb = new ConexionDB();
            crearTabDb.createTables();
        }

        if (opcion == 2) {
            ConexionDB crear = new ConexionDB();
            crear.createTables();
            
            InsertarData insertarData = new InsertarData();
            insertarData.insertarData();
            
            LoginController loginController = new LoginController();
            loginController.iniciarSesion();
        }
    }
}