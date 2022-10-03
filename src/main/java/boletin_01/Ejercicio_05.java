package boletin_01;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
//Ejercicio 05: Pedir un número e indicar si es positivo o negativo.
public class Ejercicio_05 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        int num;
        System.out.print("Introduce un número: ");
        num=Entrada.nextInt();

        if( num < 0){
            System.out.println("Negativo");
        }else{
            // suponemos que el 0 es positivo.
            System.out.println("Positivo");
        }
    }
    
}
