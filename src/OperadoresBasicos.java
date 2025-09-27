import java.util.Scanner;

public class OperadoresBasicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();

        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;   
        int modulo = a % b;

        System.out.println("Suma = " + suma);
        System.out.println("Resta = " + resta);
        System.out.println("Multiplicación = " + multiplicacion);
        System.out.println("División = " + division);
        System.out.println("Módulo = " + modulo);

        sc.close();
    }
}
