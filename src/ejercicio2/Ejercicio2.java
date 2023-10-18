package ejercicio2;

public class Ejercicio2 {
    public static void main(String[] args) {
        // declaración de variables
        int contador = 0;

        /* en caso de que la variable contador sea positiva se mostrará por pantalla, se le sumará una unidad al
        * contador al final del bucle independientemente de que el número sea par o impar.*/
        do{
            if(contador % 2 == 0){
                System.out.println(contador);
            }
            contador++;
        }while(contador <= 200);
    }
}
