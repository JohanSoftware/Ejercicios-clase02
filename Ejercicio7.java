/* Ejercicio 7: Calculadora Básica
Escribe un programa que solicite al usuario dos números y luego realice las operaciones de 
suma, resta, multiplicación y división con esos números. Muestra los resultados en la consola. */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner operacion = new Scanner(System.in);
        
        System.out.print("Digite el primero numero: ");
        var num1 = operacion.nextInt();

        System.out.print("Digite el segundo numero: ");
        var num2 = operacion.nextInt();

        var suma = num1 + num2;
        System.out.println("La suma es: "+ suma);
        var resta = num1 - num2;
        System.out.println("La resta es: "+ resta);
        var multiplicación = num1 * num2;
        System.out.println("La multiplicación es: "+ multiplicación);
        double division = num1 / num2;
        System.out.println("La division es: "+ division);

        operacion.close();
    }
}
