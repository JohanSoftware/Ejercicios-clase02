/* ¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
       RTA: La respuesta correcta es 9, ya que el proceso primero realizar la suma 
       y luego mulitplica por la division. 
       Explique por que la otra calculadora genera un resultado diferente.
       RTA: por que matematicamente por leyes de jerarquia hace una operacion distinta por parentesis
       ya que para el programa es 9 pero matematicamente es 1  */ 


public class Ejercicios1 {
    public static void main(String[] args) {

       var operation1 = 6/2 * (1+2) ;
       System.out.printf("La respuesta correcta es: %d%n", operation1);

        byte num1 = 1;
        byte num2 = 2;
        byte num3 = 6;
        var operation2 = num3 / (num2 * ( num1 + num2 ));
        System.out.printf("Aqui el resultado es diferente\r\n" +
                        "ya que la calculadora es un poco antigua y resuelve de una forma distinta la operacion y eso daria: %d", operation2);
       
    }
}


       