/*
 * Ejercicio 10: Programa Java que
 * Lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
 */
package cac.java.tdp;
import java.util.Scanner;

/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Ingresa un número entero: ");
        int numero = teclado.nextInt();
        System.out.print("El doble del número elegido es: ");
        System.out.println(numero*2);
        System.out.print("El triple del número elegido es: ");
        System.out.println(numero*3);
        
    }
    
}
