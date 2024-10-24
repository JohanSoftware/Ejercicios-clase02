import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
       

       var entrada = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre: ");

       var entero = entrada.nextLine();

       System.out.println(entero);

       entrada.close();

    }
}