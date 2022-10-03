package boletin_01;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
//Ejercicio 03: Pedir el radio de una circunferencia y calcular su longitud.
public class Ejercicio_03 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        
        double l,r; // longitud y radio
        System.out.print("Introduce el radio de una circunferencia: ");
        r=Entrada.nextDouble();
        l=2*Math.PI*r;

        System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
    }
}
