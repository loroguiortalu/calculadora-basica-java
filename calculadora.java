package calculadora;


import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// he hecho Source-> Format    para ver el código como más bonito
		boolean continuar = true;

		while (continuar) {
			System.out.println("\nSelecciona una operación:");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Módulo");// modulo incluido
			System.out.println("6. Potencia");//potencia incluida
			System.out.println("7. Salir");// y salir lo he vuelto a mover abajo una vez más
			System.out.print("Elige una opción: ");

			int opcion = scanner.nextInt();

			if (opcion >= 1 && opcion <= 6) {
				System.out.print("Ingresa el primer número: ");
				double num1 = scanner.nextDouble();
				System.out.print("Ingresa el segundo número: ");
				double num2 = scanner.nextDouble();

				switch (opcion) {
					case 1:
						System.out.println("Resultado de la suma: " + sumar(num1, num2));
						break;
					case 2:
						System.out.println("Resultado de la resta: " + restar(num1, num2));
						break;
					case 3:
						System.out.println("Resultado de la multiplicación: " + multiplicar(num1, num2));
						break;
					case 4:
						if (num2 != 0) {
							System.out.println("Resultado de la división: " + dividir(num1, num2));
						} else {
							System.out.println("Error: No se puede dividir entre cero.");
						}
						break;
					case 5:
						if (num2 != 0) {
							System.out.println("Resultado del módulo: " + modulo(num1, num2));
						} else {
							System.out.println("Error: No se puede calcular el módulo con un divisor de cero.");
						}
						break;

					case 6:
						System.out.print("Ingresa el exponente (debe ser un número entero): ");
						num2 = scanner.nextDouble();
						if (Entero(num2)) {
							System.out.println("Resultado de la potencia: " + potencia(num1, (int) num2));//debe de ser un entero si o si porque es el exponente, no servírían números decimales por ejemplo
						} else {
							System.out.println("Error: El exponente debe ser un número entero.");
						}
						break;

				}
			} else if (opcion == 7) {
				continuar = false;
				System.out.println("Saliendo de la calculadora...");
			} else {
				System.out.println("Opción no válida. Intenta nuevamente.");
			}
		}

		scanner.close();
	}

	public static double sumar(double a, double b) {
		return a + b;
	}

	public static double restar(double a, double b) {
		return a - b;
	}

	public static double multiplicar(double a, double b) {
		return a * b;
	}

	public static double dividir(double a, double b) {
		return a / b;
	}

	public static double modulo(double a, double b) {
		return a % b;
	}//imagino

	public static double potencia(double a, int b) {
		return Math.pow(a, b);//menos mal que existen los métodos y no tengo que inventarme cosas por mi cuenta
	}
	
	// recurso:
	/*     tienes que ponerle el    https:/ /    docs.oracle.com/javase/8/docs/api/java/lang/Math.html      */

	// y para comprobar que el número sea entero
	public static boolean Entero(double b) {
		return b == Math.floor(b); 
	}
}
