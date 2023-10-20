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

        /* genera un número aleatorio y lo muestra al usuario, en caso de que el usuario introduzca 'igual' se cierra
        * el bucle, al introudir mayor el número generado pasará a ser el mínimo para generar el siguiente número y
        * al introducir menor el número generado pasará a ser el máximo para generar el siguiente número.*/
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
        /* en caso de que el usuario mienta a la máquina y no pueda generar otro número porque el mínimo y el máximo
        * son iguales, se para el bucle.*/
        }while(!(entradaUsuario.equalsIgnoreCase("igual") || min == max));
        System.out.println("Soy la máquina que todo lo ve. Tu número secreto es: " + nAleatorio);
        sc.close();
    }
}
