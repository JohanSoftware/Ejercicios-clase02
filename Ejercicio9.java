/* Ejercicio 9: Conversión de Temperaturas
Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin.
 Usa las siguientes fórmulas:

Fahrenheit = Celsius * 9/5 + 32
Kelvin = Celsius + 273.15 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner grados = new Scanner(System.in);

        System.out.print("Ingrese los grados celcius a convertir: ");
        var celcius = grados.nextInt();

        System.out.println("Los grados celcius en Fahrenheit es: "+ celcius * 9/5 + 32);
        System.out.println("Los grados celcius en Kelvin es: "+ celcius + 273.15);

        grados.close();
    }
}
