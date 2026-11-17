package guia2;
import javax.swing.JOptionPane;

public class guia2Main {
    public void Guia2() {

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Ingresando a los Ejercicios De la guia 2 \n" +
                "1.Ejercicios Try Catch \n" +
                "2.Ingresando A Ejercicios Con Base De Datos"));

        if (opcion == 1) {
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "============================================== \n"+
                "== Ingresando a los ejercicios de Try Catch == \n"+
                "============================================== \n"+
                "1. División entera básica \n"+
                "2. Conversión de temperatura \n"+
                "3. Calculadora de IMC \n"+
                "4. Acceso a arreglo por índice \n"+
                "5. Validación con bucle (retry) \n"+
                "5. Cancelación del diálogo (NullPointerException) \n"+
                "Ingrese la opcion deseada -> \n"+
                "\n"
            )
        );

        switch (opcion) {

            case 1:
                Ejercicio1 ej1 = new Ejercicio1();
                ej1.DivisionEnteraBasica();
                break;

            case 2:

                // Ejercicio2()
                break;

            case 3:

                // Ejercicio3()
                break;
            
            case 4:

                // Ejercicio4()
                break;

            case 5:
                Ejercicio5 ej5 = new Ejercicio5();
                ej5.ValidacionConWhile();
                break;

            case 6:

                // Ejercicio6()
                break;
        
            default:
                JOptionPane.showConfirmDialog(null, "Ingreso una opcion invalida");
                break;
        }



        }
        if (opcion == 2) {
            // Ejemplo
            // MainPersistenciaData BaseDatos = new MainPersistenciaData();
            // BaseDatos.MenuBaseDeDatos();
        }

    }
}
