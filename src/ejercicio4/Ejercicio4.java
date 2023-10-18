package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // declaración de variables
        int entradaUsuario;
        int contador = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número:");
        entradaUsuario = sc.nextInt();

        do{
            System.out.println(entradaUsuario + " x " + contador + " = " + (entradaUsuario*contador));
            contador++;
        }while(contador <= 10);

        sc.close();
    }
}
