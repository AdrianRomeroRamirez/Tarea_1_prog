/*
 * Ejercicio7.java
 * Programa que muestra los resultados de distintas operaciones aritméticas
 */

package tarea1;

/**
 * @author AdrianRomero
 */

public class Ejercicio7 {
    
    /**
     * Este metodo mostrara los resultados de distintas operaciones aritméticas 
     * @param 
     */
    
    public static void main(String[] j) {
        
        // Los tipos de datos "double" declaran numeros en coma flotante
        
        double a=6, b=8, resultado;
        
        // Aquí comienza el código
        
        System.out.println("El valor de a es: " + a + " y el de b es: " + b);
        System.out.println("Veamos el resultado despues de las "
                + "siguientes operaciones:");
        resultado=a*2-5; // Calculamos a*2-5
        System.out.println("a*2-5 = " + resultado);
        resultado=(3+a)/3+2*b; // Calculamos (3+a)/3+2*b
        System.out.println("(3+a)/3+2*b = " + resultado);
        resultado=3*a-b/8; // Calculamos 3*a-b/8
        System.out.println("3*a-b/8 = " + resultado);
        
    } // Fin main
    
} // Fin Ejercicio7
