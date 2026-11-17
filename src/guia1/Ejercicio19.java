package guia1;

public class Ejercicio19 {
	
	public void NumerosMultiples() {
		int cantidad = 0;

		for (int numero = 1; numero <= 200; numero++) {
			if (numero % 10 == 0) {
				cantidad++;
			}
		}

		System.out.println("Cantidad de múltiplos de 10: " + cantidad);
	}
}
    