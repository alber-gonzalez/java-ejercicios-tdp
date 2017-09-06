/*
 * Ejercicio 11: Programa que
 * Lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
 * La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
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
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresá la temperatura en grados centígrados");
        double temperatura = teclado.nextDouble();
        System.out.println("La temperatura en grados Faharenheit es de: " + (32 + ((9*temperatura)/5)));
        
        
    }
    
}
