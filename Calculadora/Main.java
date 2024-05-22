import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        int num2 = scanner.nextInt();

        Calculadora calculadora1 = new Calculadora();

        int resultadoSuma = calculadora1.suma(num1, num2);
        System.out.println("El resultado de la suma es: " + resultadoSuma + "\n");

        int resultadoResta = calculadora1.resta(num1, num2);
        System.out.println("El resultado de la resta es: " + resultadoResta + "\n");

        double resultadoDivision = calculadora1.division(num1, num2);
        System.out.println("El resultado de la division es: " + resultadoDivision + "\n");

        int resultadoMultiplicacion = calculadora1.multiplicacion(num1, num2);
        System.out.println("El resultado de la multiplicacion es: " + resultadoMultiplicacion + "\n");

        double resultadoPotencia = calculadora1.potencia(num1, num2);
        System.out.println("El resultado de la potencia es: " + resultadoPotencia + "\n");

        scanner.close();
    }
}