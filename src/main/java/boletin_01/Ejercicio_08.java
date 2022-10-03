package boletin_01;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
//Ejercicio 08: Pedir dos números y decir cual es el mayor o si son iguales.
public class Ejercicio_08 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        int n1,n2;
        System.out.print("Introduce un número: ");
        n1=Entrada.nextInt();
        System.out.print("Introduce otro número: ");
        n2=Entrada.nextInt();

        if(n1==n2){
            System.out.println("Son iguales");
        }else{
            if(n1>n2){
                System.out.println(n1 + " es mayor que " + n2);
            }else{
                System.out.println(n2 + " es mayor que " + n1);
            }
        }
    }
}
