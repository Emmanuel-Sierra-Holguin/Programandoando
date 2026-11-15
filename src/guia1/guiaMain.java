package guia1;
import javax.swing.JOptionPane;

public class guiaMain {
    public void Guia1() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Bienvenido a lista de ejercicios Guia 1 \n" +
                        "1.Ejercicios Estructuras Condicionales\n" +
                        "2.Ejercicios practicos: ciclos for, while y arreglos.\n" +
                        "Ingrese una opción de Ejercicio\n"));

        if (opcion == 1) {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "1.ejercicio Estructuras Condicionales \n " +
                                    "Lista de Ejercicios: \n" +
                                    "1. Pida un numero entero al usuario e imprima si es Positivo, Negativo o Cero. Use if - else if - else. \n"
                                    +
                                    "2. Solicite un numero entero y determine si es Par o Impar. Use el operador modulo (%). \n"
                                    +
                                    "3. Pida la edad del usuario. Si es >= 18 mostrar 'Puede ingresar', si es menor 'Acceso denegado', si es negativa 'Edad invalida'. \n"
                                    +
                                    "4. Solicite dos numeros y un operador (+, -, *, /). Realice la operacion con switch. Valide la division entre cero. \n"
                                    +
                                    "5. Pida un anio y determine si es bisiesto. Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400. \n"
                                    +
                                    "6. Pida una nota entre 0 y 100 y clasifiquela: 90-100 Excelente, 80-89 Bueno, 70-79 Aceptable, 60-69 Insuficiente, <60 Reprobado. Valide el rango. \n"
                                    +
                                    "7. Solicite tres numeros e imprima cual es el mayor. Extra: si hay empate entre dos o los tres, indicarlo. \n"
                                    +
                                    "8. Solicite el valor de una compra y aplique descuento: >$500.000 = 20%, >$200.000 = 15%, >$100.000 = 10%. Mostrar valor original, descuento y total. \n"
                                    +
                                    "9. Simule un login: usuario correcto 'admin', contrasena '1234'. Si coinciden mostrar 'Bienvenido', si no 'Credenciales incorrectas'. Use equals(). \n"
                                    +
                                    "10. Solicite peso (kg) y altura (m). Calcule IMC = peso / (altura * altura). Clasifique: <18.5 Bajo peso, 18.5-24.9 Normal, 25-29.9 Sobrepeso, >=30 Obesidad. \n"
                                    +
                                    "Ingrese una opcion: \n" +
                                    "\n")

            );
            // ====================== Ejecución ejercicios ======================
            // Acá se debe de poner el caso y la opción de ejercicio siguiendo la estructura
            // de abajo.
            // Es cosa de copiar y pegar lo de abajo según el ejercicio reemplazando el
            // numero y ya.
            // El metodo que se llama se deberá de definir al final del archivo.
            // =================================================================
            switch (opcion) {

                case 1:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 1");
                    Ejercicio1 ej1 = new Ejercicio1();
                    ej1.NumeroEntero();
                    break;

                case 2:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 2");
                    // Ejercicio2();
                    break;

                case 3:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 3");
                    // Ejercicio 3();
                    break ;

                case 4:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 4");
                    Ejercicio4 ej4 = new Ejercicio4();
                    ej4.Calculadora();
                    break;

                case 5:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 5");
                    // Ejercicio5();
                    break;

                case 6:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 6");
                    // Ejercicio6();
                    break;
                
                case 7:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 7");
                    // Ejercicio7();
                    break;

                case 8:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 8");
                    Ejercicio8.main(null);
                    break;

                case 9:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 9");
                    Ejercicio9.main(null);
                    break;
                
                case 10:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 10");
                    Ejercicio10 ej10 = new Ejercicio10();
                    ej10.CalcularIMC();
                    break;


                default:
                    JOptionPane.showConfirmDialog(null, "Ingreso una opcion invalida");
                    break;
            }

        } else if (opcion == 2) {

            System.out.println("Ingrese una opcion ");

            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(null,
                            "2.Ejercicios practicos: ciclos for, while y arreglos. \n " +
                                    "11. Imprimir los numeros del 1 al 50 usando un ciclo for. \n"
                                    +
                                    "12. Mostrar los numeros del 50 al 1 usando un ciclo for. \n"
                                    +
                                    "13. Imprimir todos los numeros pares del 1 al 100 usando un ciclo for. \n"
                                    +
                                    "14. Imprimir todos los numeros impares del 1 al 100 usando un ciclo while. \n"
                                    +
                                    "15. Calcular la suma de los numeros del 1 al 100 usando un ciclo for. \n"
                                    +
                                    "16. Calcular la suma de los numeros impares del 1 al 50 usando un ciclo for. \n"
                                    +
                                    "17. Mostrar la tabla de multiplicar del numero 7 usando un ciclo for. \n"
                                    +
                                    "18. Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados. \n"
                                    +
                                    "19. Contar cuantos numeros del 1 al 200 son multiples de 10 usando un ciclo for. \n"
                                    +
                                    "20. Mostrar los numeros del 1 al 100 que sean divisibles entre 3 Y entre 5 simultaneamente. \n"
                                    +
                                    "21. Calcular el factorial de un numero almacenado en una variable usando un ciclo for. \n"
                                    +
                                    "22. Declarar un arreglo de 10 numeros e imprimir cada elemento usando un ciclo for. \n"
                                    +
                                    "23. Calcular la suma de todos los elementos de un arreglo usando un ciclo for. \n"
                                    +
                                    "24. Encontrar el numero mayor dentro de un arreglo usando un ciclo for. \n"
                                    +
                                    "25. Encontrar el numero menor dentro de un arreglo usando un ciclo for. \n"
                                    +
                                    "26. Contar cuantas veces aparece un numero especifico dentro de un arreglo. \n"
                                    +
                                    "27. Imprimir un cuadrado de 6x6 asteriscos usando ciclos for anidados. \n"
                                    +
                                    "28. Mostrar los primeros 20 numeros y su cubo (n^3) usando un ciclo for. \n"
                                    +
                                    "29. Recorrer una cadena de texto e imprimir cada caracter en una linea usando un ciclo for. \n"
                                    +
                                    "Ingrese una opcion\n" +
                                    "\n")

            );

            // ====================== Ejecución ejercicios ======================
            // Acá se debe de poner el caso y la opción de ejercicio siguiendo la estructura
            // de abajo.
            // Es cosa de copiar y pegar lo de abajo según el ejercicio reemplazando el
            // numero y ya.
            // El metodo que se llama se deberá de definir al final del archivo.
            // =================================================================
            switch (opcion) {

                case 11:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 11");
                    Ejercicio11 ej11 = new Ejercicio11();
                    ej11.Imprimir();
                    break;

                case 12:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 12");
                    Ejercicio12 ej12 = new Ejercicio12();
                    ej12.ImprimirAlRevez();
                    break;
                
                case 13:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 13");
                    // Aca se llama al ejercicio 13
                    break;

                case 14:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 14");
                    // Aca se llama al ejercicio 14
                    break;
                
                case 15:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 15");
                    Ejercicio15 ej15 = new Ejercicio15();
                    ej15.Suma();
                    break;
                
                case 16:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 16");
                    Ejercicio16.main(null);
                    break;
                
                case 17:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 17");
                    Ejercicio17.main(null);
                    break;
                
                case 18:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 18");
                    Ejercicio18 ej18 = new Ejercicio18();
                    ej18.TablaMultiplicar();
                    break;
                
                case 19:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 19");
                    // Aca se llama al ejercicio 19
                    break;
                
                case 20:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 20");
                    // Aca se llama al ejercicio 20
                    break;
                
                case 21:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 18");
                    Ejercicio21 ej21 = new Ejercicio21();
                    ej21.Factorial();
                    break;

                case 22:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 22");
                    // Aca se llama al ejercicio 22
                    break;
                
                case 23:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 23");
                    // Aca se llama al ejercicio 23
                    break;
                
                case 24:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 24");
                    // Aca se llama al ejercicio 24
                    break;
                
                case 25:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 25");
                    Ejercicio25.main(null);
                    break;
                
                case 26:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 26");
                    Ejercicio26.main(null);
                    break;

                case 27:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 24");
                    // Aca se llama al ejercicio 27
                    break;

                case 28:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 28");
                    Ejercicio28.main(null);
                    break;

                case 29:
                    JOptionPane.showConfirmDialog(null, "Ingreso al Ejercicio 29");
                    // Aca se llama al ejercicio 29
                    break;

                default:
                    JOptionPane.showConfirmDialog(null, "Ingreso una opcion invalida");
                    break;

            }

        } else {
            JOptionPane.showConfirmDialog(null, "Ingreso una opcion invalida");
        }

    }

    // ====================== Invocar ejercicios ======================
    // Aquí se invocan los ejercicios atravez de métodos.
    // Es solo copiar y pegar el método, cambiar el nombre y al método al que accede
    // (TablaDel7.TablaMultiplicarDel7()).
    // ================================================================
    public void Ejercicio1() {
        // Ejercicio1 TablaDel7 = new Ejercicio1();
        // TablaDel7.TablaMultiplicarDel7();
    }

    public void Ejercicio2() {
        // Ejercicio2 FactorialDeUnNumero = new Ejercicio2();
        // FactorialDeUnNumero.FactorialDeUnNumero();
    }
}
