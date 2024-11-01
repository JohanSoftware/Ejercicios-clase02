/* Ejercicio 8: Área y Perímetro de un Rectángulo
Crea un programa que calcule el área y el perímetro de un rectángulo.
Solicita al usuario la longitud y el ancho del rectángulo. */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);

        System.out.print("Digita la base del rectangulo: ");
        int base = calculo.nextInt();
        System.out.print("Digite la altura del rectangulo: ");
        var altura = calculo.nextInt();

        var area = base * altura;
        System.out.println("El area del rectangulo es: "+ area);

        var perímetro = 2*(base + altura);
        System.out.println("El perimetro es: "+ perímetro);
        calculo.close();

    }
}
