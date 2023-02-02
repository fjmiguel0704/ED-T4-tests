package ejemplos.condicionales;

import java.util.Scanner;

public class Ejercicio3switch {
	//PRUEBAS:
		//Introduce 6 y 3. Selecciona A
		//Resultado esperado: num1+num2 = 9 
		//Resultado obtenido: 9
		//Introduce 6 y 3. Selecciona B
		//Resultado esperado: num1-num2 = 3
		//Resultado obtenido: 3
		//Introduce 7 y 3. Selecciona C
		//Resultado esperado: num1*num2 = 21
		//Resultado obtenido: 21
		//Introduce 8 y 2. Selecciona D
		//Resultado esperado: num1/num2 = 4
		//Resultado obtenido: 4
		//Introduce 7 y 8. Selecciona E
		//Resultado esperado: ERROR
		//Resultado obtenido: ERROR
	public static void main(String[] args) {
		// num1 y num2 serán los dos números que solicitaremos al usuario
		double num1, num2;
		
		// En opcion guardamos la opción seleccionada por el usuario
		String opcion;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca los dos números
		System.out.println("Introduzca un número:");
		num1 = sc.nextDouble();
		
		System.out.println("Introduzca otro número:");
		num2 = sc.nextDouble();
		
		// Imprimimos menú por pantalla
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		
		// Le pedimos al usuario que introduzca una opción
		System.out.println("Introduzca una opción:");
		opcion = sc.next();
		
		// Según la opción seleccionada, realizaremos una operación u otra
		switch(opcion) {
		case "A": 
			// Se realiza la suma de los dos números
			System.out.println("La suma de los números es: " + (num1+num2));
			break;
		case "B":
			// Se realiza la resta de los dos números
			System.out.println("La resta de los dos números es: " + (num1 - num2));
			break;
		case "C":
			// Se realiza la multiplicación de los dos números
			System.out.println("La multiplicación de los dos números es: " + (num1 * num2));
			break;
		case "D":
			// Habría que devolver la división de los dos números
			// Comprobamos que el divisor sea distinto de 0 antes de realizar la división
			if(num2==0) {
				// Si es 0, mostramos mensaje de error
				System.out.println("ERROR: No se puede dividir por 0.");
			} else {
				// Si es distinto de 0, llevamos a cabo la división
				System.out.println("La división entre los dos números es: " + (num1 / num2));
			}
			break;
		default:
			// No se ha introducido una opción correcta
			System.out.println("ERROR: No ha introducido una opción correcta.");
		}
	}

}
