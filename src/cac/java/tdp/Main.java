/*
 * Ejercicio 09:
 * Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.
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
        
        System.out.println("Ingrese su nombre:");
        String name = teclado.next();
        System.out.println("El nombre ingresado es:");
        System.out.println(name);
        
        
        
        
        
    }
    
}
