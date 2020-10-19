/*
 * Ejercicio3.java
 * Programa que muestra distintas modificaciones de "x"
 */

package tarea1;

/**
 * @author AdrianRomero
 */

public class Ejercicio3 {
    
    /**
     * Este método se usará para hacer distintas modificaciones a "x"
     * @param args
     */
    
    public static void main(String[] args) {
        
        // Los tipos de datos "int" declaran un entero
        
        int x=8;
        
        // Código de la aplicación
        
        System.out.println("El valor inicial de x es: " + x);
        x=x+2; //La variable x toma el valor 10 (8+2)
        System.out.println("Después de la primera modificación es: " + x);
        x=x-3; //La variable x toma el valor 7 (10-3)
        System.out.println("Después de la segunda modificación es: " + x);
        x=x*3; //La variable x toma el valor 21 (7*3)
        System.out.println("Después de la tercera modificación es: " + x);
        x=x+1; //La variable x toma el valor 22 (21+1)
        System.out.println("Después de la cuarta modificación es: " + x);
        x=x/2; //La variable x toma el valor 11 (22/2)
        System.out.println("Después de la quinta modificaión es: " + x);
        x=x-10; //La variable x toma el valor 1 (11-10)
        System.out.println("Después de la sexta modificación es: " + x);
        
    } // Fin main
     
} // Fin Ejercicio3
