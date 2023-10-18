package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // declaración de variables
        int contador = 1;
        int sumaTotal = 0;
        int entradaUsuario;
        Scanner sc = new Scanner(System.in);

        //pedimos el número al usuario
        System.out.println("Introduce un número:");
        entradaUsuario = sc.nextInt();

        /* iteramos desde 1 hasta el número introducido por el usuario, mientras que sea distinto al número introducido
        * se imprimirá por pantalla con un '+' y si es el mismo número introducido por el usuario se imprimirá tal cual*/
        do{
            if(contador == entradaUsuario){
                System.out.print(contador);
            }else{
                System.out.print(contador + "+");
            }
            sumaTotal += contador;
            contador++;
        }while(contador <= entradaUsuario);

        // imprimimos el igual y la suma total en la misma línea que el resto de operandos
        System.out.print(" = " + sumaTotal);
        sc.close();
    }
}
