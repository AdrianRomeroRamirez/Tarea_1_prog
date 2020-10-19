/*
 * Ejercio1.java
 * Programa que muestra un enumerado de sistemas operativos
 */

package tarea1;

/**
 * @author AdrianRomero
 */

public class Ejercicio1 { 
    
    /*
     * Los tipos de datos "enum" declara una variable 
     * con un conjunto restringido de valores
     */
    
    public enum SistemasOperativos {IOS, LINUX, WINDOWS};
    
    /**
     * Este método se usará para mostrar un enumerado de sistemas operativos
     * @param args
     */
    
    public static void main(String[] args) {
        
        // Aquí comienza el código
        
        System.out.println("Listado de sistemas operativos:");
        System.out.println(SistemasOperativos.IOS);
        System.out.println(SistemasOperativos.LINUX);
        System.out.println(SistemasOperativos.WINDOWS);    
        
    } // Fin main
    
} // Fin Ejercicio1
