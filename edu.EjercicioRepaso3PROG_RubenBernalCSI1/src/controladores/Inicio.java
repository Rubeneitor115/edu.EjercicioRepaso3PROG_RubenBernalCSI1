/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * Clase controladora de la aplicación
 * @author rbr - 081024
 *
 */
public class Inicio {

	/**
	 * Método de entrada de la aplicación
	 * rbr - 081024
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Variables
		int num1 = 12, num2 = 24;
		boolean hola = false, adios = true;
		
		System.out.println("El valor de la primera variable es: " + num1);
		System.out.println("El valor de la segunda variable es: " + num2);
		
		//Muestro por consola si la primera variable es igual, mayor o menor que la segunda
		if(num1>num2) {
			System.out.println("La primera variable es mayor que la segunda");
		}else if(num1 == num2) {
			System.out.println("La primera variable es igual que la segunda");
		}else {
			System.out.println("La primera variable es menor que la segunda");
		}
		
		//Verifico si la primera variable es distinta a la primera
		if(num1 != num2) {
			System.out.println("La primera variable es distinta a la segunda");
		}else {
			System.out.println("La primera variable es igual a la segunda");
		}
		
		//Muestro la conjunción (AND) de ambas variables
		boolean AND = hola && adios;
		System.out.println("El resultado de la conjunción AND es: " + AND);
		//Muestro la conjunción (OR) de ambas variables
		boolean OR = hola || adios;
		System.out.println("El resultado de la conjunción OR es: " + OR);
		//Muestro la conjunción (NOT) de ambas variables
		boolean NOT = hola != adios;
		System.out.println("El resultado de la conjunción NOT es: " + NOT);

	}

}
