/*
 * Ejercicio6.java
 * Programa que muestra si un numero aleatroio esta entre un rango
 * de valor determinado
 */

package tarea1;

/**
 * @author AdrianRomero
 */

public class Ejercicio6 {
    
    /**
     * Este método se usara para mostrar si un numero aleatorio creado
     * por nosotros estan entre un rango de valores
     * @param args 
     */
    
    public static void main(String[] args) {
        
        // Los tipos de datos "double" declaran numeros en coma flotante
        // a contendrá un número aleatorio entre -5 y 4
        
        double a=Math.random()*(-5-4)+4;
        
        // Los tipos de datos "String" declaran una cadena de caracteres
        
        String cad;
        
        // Aquí comienza el código
        
        System.out.println("El número aleatorio que hemos creado:");
        
        // Comprobamos si a está entre -5 y 0, 0 no incluido
        cad=(a>=-5 && a<0)?"Si":"No";
        System.out.println(cad + " está entre -5 y 0, 0 no incluido.");
        
        // Comprobamos si a está entre 0 y 2, ambos incluidos
        cad=(a>=0 && a<=2)?"Si":"No";
        System.out.println(cad + " está entre 0 y 2, ambos incluidos.");
        
        // Comprobamos si a está entre 2 y 4, 2 no incluido
        cad=(a>2 && a<=4)?"Si":"No";
        System.out.println(cad + " está entre 2 y 4, 2 no incluido.");
         
    } // Fin main
    
} // Fin Ejercicio6
