/*
 * Ejercicio 15: Programa que calcula el volumen de una esfera.
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
    double radio, volumen;
    System.out.println("Ingrese el radio de una esfera:");
    radio = teclado.nextDouble();
    System.out.println("El volumen de la esfera es "+(volumen=(4.0/3)*Math.PI*Math.pow(radio,3)));    
    }
}
