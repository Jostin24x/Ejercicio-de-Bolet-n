package boletin_01;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
//Ejercicio 04: Pedir dos números y decir si son iguales o no.
public class Ejercicio_04 {
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
            System.out.println("No son iguales");
        }
    }
}
