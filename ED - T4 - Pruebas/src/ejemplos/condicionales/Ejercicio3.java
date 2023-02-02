package ejemplos.condicionales;

import java.util.Scanner;

public class Ejercicio3 {
	//PRUEBAS:
			//No es casi-cero:
			// numero =  0
			//numero  >1
			//numero  <-1
			//Resultado esperado: No es casi-cero
			//Resultado obtenido: No es casi-cero
			//Es casi cero:
			//numero != 0
			//numero <1
			//numero >-1
			//Resultado esperado: Es casi-cero
			//Resultado obtenido: Es casi-cero
	public static void main(String[] args) {
		// En la variable numero guardaremos el número introducido por el usuario
		double numero;
		
		//Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca un número real por teclado
		System.out.println("Introduzca un número real:");
		numero = sc.nextDouble();
		
		// Un número casi-cero es aquel que está en el rango (-1, 1) y es distinto de 0
		if(numero > -1 && numero < 1 && numero!=0) {
			System.out.println("Es casi-cero");
		} else
			System.out.println("No es casi-cero");
	}

}
