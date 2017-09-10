/*
 * Ejercicio 14: Programa lea la longitud de los catetos de un triángulo
 * rectángulo y calcule la longitud de la hipotenusa según el
 * teorema de Pitágoras. 
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
        double catetoMayor, catetoMenor;
        System.out.println("Ingrese la longitud del cateto mayor: ");
        catetoMayor = teclado.nextDouble();
        System.out.println("Ingrese la longitud del cateto menor: ");
        catetoMenor = teclado.nextDouble();
        System.out.println("La hipotenusa es: "+Math.sqrt(Math.pow(catetoMayor,2)
        +Math.pow(catetoMenor,2)));
    }
}
