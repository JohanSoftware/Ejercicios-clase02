/* Ejercicio 10: Media Aritmética
Crea un programa que calcule la media aritmética de tres números introducidos por el usuario. */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner medida = new Scanner(System.in);
        System.out.print("Digite el primero numero para la media aritmetica: ");
        var num1 = medida.nextInt();
        System.out.print("Digite el segundo numero para la media aritmetica: ");
        var num2 = medida.nextInt();
        System.out.print("Digite el tercer numero para la media aritmetica: ");
        var num3 = medida.nextInt();

        var medidaFinal = (num1+num2+num3)/3;
        System.out.println("La medida aritmetica es: "+ medidaFinal);

        medida.close();
    }
}
