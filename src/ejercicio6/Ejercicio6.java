package ejercicio6;

import java.util.Scanner;
public class Ejercicio6 {

    public static final String TIJERA = "TIJERAS";
    public static final String PAPEL = "PAPEL";
    public static final String PIEDRA = "PIEDRA";

    public static void main(String[] args) {
        // declaración de variables
        char continuar = 'S';
        String entradaUsu0, entradaUsu1;
        Scanner sc = new Scanner(System.in);

        do{
                System.out.println("JUGADOR 1: ");
                do{
                    System.out.println("Introduce piedra, papel o tijeras:");
                    entradaUsu0 = sc.nextLine().toUpperCase();
                }while(!entradaUsu0.equals(TIJERA) && !entradaUsu0.equals(PAPEL) && !entradaUsu0.equals(PIEDRA));

                // imprimimos líneas para que el usuario 2 no vea lo que ha introducido el usuario 1
                for(int i = 1; i<100;i++) {
                    System.out.println();
                }

                System.out.println("JUGADOR 2: ");
                do {
                    System.out.println("Introduce piedra, papel o tijeras:");
                    entradaUsu1 = sc.nextLine().toUpperCase();
                }while(!entradaUsu1.equals(TIJERA) && !entradaUsu1.equals(PAPEL) && !entradaUsu1.equals(PIEDRA));

                if(entradaUsu0.equals(PIEDRA) && entradaUsu1.equals(PIEDRA)
                        || entradaUsu0.equals(PAPEL) && entradaUsu1.equals(PAPEL)
                        || entradaUsu0.equals(TIJERA) && entradaUsu1.equals(TIJERA))
                {
                    System.out.println("EMPATE");
                }else if(entradaUsu0.equals(PIEDRA) && entradaUsu1.equals(TIJERA)
                        || entradaUsu0.equals(TIJERA) && entradaUsu1.equals(PAPEL)
                        || entradaUsu0.equals(PAPEL) && entradaUsu1.equals(PIEDRA))
                {
                    System.out.println("GANA EL JUGADOR 1. FELICIDADES");
                }else if(entradaUsu0.equals(TIJERA) && entradaUsu1.equals(PIEDRA)
                        || entradaUsu0.equals(PAPEL) && entradaUsu1.equals(TIJERA)
                        || entradaUsu0.equals(PIEDRA) && entradaUsu1.equals(PAPEL))
                {
                    System.out.println("GANA EL JUGADOR 2. FELICIDADES");
                }else {
                    System.out.println("ENTRADA INCORRECTA. SE SUSPENDE EL JUEGO");
                }

            System.out.println("¿Deseas seguir jugando? (Sí/No)");
            continuar = sc.nextLine().toUpperCase().charAt(0);
        }while(continuar == 'S');
        System.out.println("Adios.");
        sc.close();
    }
}
