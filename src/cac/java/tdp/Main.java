/*
 * EJERCICIO 07: Programa Java quE:
 * declare una variable C de tipo entero y asígnale un valor.
 * A continuación muestra un mensaje indicando si el valor de C es positivo o negativo,
 * si es par o impar, si es múltiplo de 5,
 * si es múltiplo de 10
 * y si es mayor o menor que 100.
 * Consideraremos el 0 como positivo.
 * Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.
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
        
        int C;
        
        C = 990;

        System.out.println(C>=0? "positivo" : "negativo");
        System.out.println(C%2==0? "par" : "impar");
        System.out.println(C%5==0? "es multiplo de 5" : "no es multiplo de 5");
        System.out.println(C%10==0? "es multiplo de 10" : "no es multiplo de 10");
        System.out.println(C>100? "mayor que 100" : "menor que 100");
        
        
    }
    
}
