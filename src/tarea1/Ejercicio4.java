/*
 * Ejercicio4.java
 * Programa que muestra una secuencia de resultados "false,true"
 */

package tarea1;

/**
 * @author AdrianRomero
 */

public class Ejercicio4 {
    
    /**
     * Este mètodo se usará para mostrar una secuencia de "false, true"
     * @param args 
     */
    
    public static void main(String[] args) {
        
        // Los tipos de datos "int" declaran un entero
        
        int a=2, b=3;
        
        // Los tipos de datos booleando dan salida false o true
        
        boolean resultado;
        
        // Aquí comienza el código
        
        System.out.println("Dado que el valor de a es 2 y el valor de b es 3,"
                + "las siguientes afirmaciones son:");
        resultado=a==b; // Comprobamos si son iguales
        System.out.println("a=b: " + resultado);
        resultado=a!=b; // Comprovamos si son distintos
        System.out.println("a!=b: " + resultado);
        resultado=a>b; // Comprobamos si a es mayor que b
        System.out.println("a>b: " + resultado);
        resultado=a<b; // Comprobamos si a es menor que b
        System.out.println("a<b: " + resultado);
        resultado=a>=b; // Comprobamos si a es mayor o igual que b
        System.out.println("a>=b: "+ resultado);
        
    } // Fin main
    
} // Fin Ejercicio4
