/* Ejercicio 2: ¿Ves algún error en el precio?
En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen. Azuaga
 en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€. 
¿Crees que es correcto el precio?

En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto. */
public class Ejercicio2 {
    public static void main(String[] args) {
        
        var valorKilo = 29.75;
        var valorGramos = 5.95;
        var valorPorcion = 100;

        // Calcular el precio por kilogramo basado en el precio de la porción de 100 gramos
        double valorReal = (valorGramos / valorPorcion) * 1000;

        System.out.println("Precio por kilo declarado por el vendedor: " + valorKilo);
        System.out.println("Precio por kilo calculado: " + valorReal);
        
        // Mostrar la diferencia para ver si el precio declarado es correcto
        System.out.println("Diferencia entre el precio declarado y el calculado: " + (valorKilo - valorReal));
    }
}

