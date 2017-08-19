/*
 * Ejercicio 08:
 * Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
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
        
        System.out.println("Ingresar numero1:");
        int numero1 = teclado.nextInt();
        System.out.println("Ingresar numero2:");
        int numero2 = teclado.nextInt();
        
        System.out.println("Los números ingresados son:");
        System.out.println(numero1);
        System.out.println(numero2);
        
        
        
    }
    
}
