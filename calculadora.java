package calculadora;


import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nSelecciona una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
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
                }
            } else if (opcion == 5) {
                continuar = false;
                System.out.println("Saliendo de la calculadora...");
            } else {
                System.out.println("Opción no válida. Intenta nuevamente.");
            }
        }

        scanner.close();
    }

    public static double sumar(double a, double b) { return a + b; }
    public static double restar(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) { return a / b; }
}
