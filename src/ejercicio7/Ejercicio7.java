package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int num, num0, resultado;
        char eleccion;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Introduzca el primer número:");
            num = sc.nextInt();

            System.out.println("Introduzca el segundo número:");
            num0 = sc.nextInt();

            sc.nextLine(); // traps int's \n

            System.out.println("ELIGE UNA OPCIÓN:\nA.SUMAR NÚMEROS.\nB.RESTAR NÚMEROS.\nC.MULTIPLICAR NÚMEROS\nD.DIVIDIR NÚMEROS\nE.SALIR");
            eleccion = sc.nextLine().toLowerCase().charAt(0);

            switch(eleccion) {
                case 'a':
                    resultado = num+num0;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 'b':
                    resultado = num-num0;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 'c':
                    resultado = num*num0;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 'd':
                    resultado = num/num0;
                    System.out.println("El resultado es: " + resultado);
                    break;
                case 'e':
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("ERROR");
            };
        }while(eleccion != 'e');
        sc.close();
    }
}
