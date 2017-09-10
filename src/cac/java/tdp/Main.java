/*
 * Ejercicio 13: Programa que pase una velocidad en Km/h a m/s.
 * La velocidad se lee por teclado.
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
        System.out.println("Ingrese la velocidad expresada en km. por hora");
        double velocidad = teclado.nextDouble();
        System.out.println("La velocidad es de: "+ ((velocidad*1000)/3600)+"m/s.");
        
    }
    
}
