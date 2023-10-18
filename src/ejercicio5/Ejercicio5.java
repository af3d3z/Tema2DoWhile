package ejercicio5;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        // declaración de variables
        int nAleatorio;
        int max = 101;
        int min = 1;
        String entradaUsuario;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        do{
            nAleatorio = rand.nextInt(min, max);
            System.out.println("He generado el número: " + nAleatorio + " ¿He acertado? (MENOR, MAYOR, IGUAL)");
            entradaUsuario = sc.nextLine();
            if(entradaUsuario.equalsIgnoreCase("menor")){
                max = nAleatorio;
            }else if (entradaUsuario.equalsIgnoreCase("mayor")){
                min = nAleatorio;
            } else if (!(entradaUsuario.equalsIgnoreCase("igual"))) {
                System.out.println("ERROR: Indique si el número generado es MAYOR, MENOR O IGUAL.");
                entradaUsuario = sc.nextLine();
            }
        }while(!(entradaUsuario.equalsIgnoreCase("igual")));
        System.out.println("Soy la máquina que todo lo ve.");
        sc.close();
    }
}
