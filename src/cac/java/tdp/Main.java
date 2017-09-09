/*
 * Ejercicio 12: Programa que
 * Lee por teclado el valor del radio de una circunferencia y calcula y muestra
 * por pantalla la longitud y el área de la circunferencia. Longitud de la
 * circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2  
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
        System.out.println("Ingresá el radio de una circunsferencia: ");
        double radio = teclado.nextDouble();
        double pi = 3.14;
         System.out.println("La longitud de la circunsferencia es: "+(2*pi*radio));
         System.out.println("El área de la circunsferencia es: "+(pi*(radio*radio)));
         
        
        
    }
    
}
