/*
 * EJERCICIO 02: Programa java que realice lo siguiente:
 *  declarar dos variables X e Y de tipo int,
 *  dos variables N y M de tipo double y
 *  asigna a cada una un valor. A continuación realiza y muestra por pantalla
 *  una serie de operaciones entre ellas. 
 */
package cac.java.tdp;

/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int X;
        int Y;
        double N;
        double M;
        
        X = 6;
        Y = 4;
        N = 3.5;
        M = 2.1;
        
        System.out.println(X-M);
        System.out.println(N+M);
        System.out.println(X/M);
               
        
    }
    
}
