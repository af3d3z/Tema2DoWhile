package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        int primeraTirada, segundaTirada;
        String primeraCadena, segundaCadena;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Introduzca el resultado de su primera tirada: ");
            primeraCadena = sc.nextLine().toUpperCase();

            primeraTirada = switch(primeraCadena) {
                case "UNO":
                    yield(1);
                case "DOS":
                    yield(2);
                case "TRES":
                    yield(3);
                case "CUATRO":
                    yield(4);
                case "CINCO":
                    yield(5);
                case "SEIS":
                    yield(6);
                default:
                    System.out.println("Número inválido");
                    yield(0);
            };
        }while(primeraTirada == 0);

        do{
            System.out.println("Introduzca el resultado de su segunda tirada: ");
            segundaCadena = sc.nextLine().toUpperCase();

            segundaTirada = switch(segundaCadena) {
                case "UNO":
                    yield(1);
                case "DOS":
                    yield(2);
                case "TRES":
                    yield(3);
                case "CUATRO":
                    yield(4);
                case "CINCO":
                    yield(5);
                case "SEIS":
                    yield(6);
                default:
                    System.out.println("Número inválido");
                    yield(0);
            };
        }while(segundaTirada == 0);

        System.out.println("1ª Tirada: " + primeraTirada);
        System.out.println("2ª Tirada: " + segundaTirada);
        System.out.println("Suma: " + (primeraTirada + segundaTirada));
    }
}
