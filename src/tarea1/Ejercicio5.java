/*
 * Ejercicio5.java
 * Programa que muestra el resultado de operadores lógicos
 */

package tarea1;

/**
 * @author AdrianRomero
 */

public class Ejercicio5 {
    
    /**
     * Este método se usará para mostrar un resultado de operador lógico
     * @param args 
     */
    
    public static void main(String[] args) {
        
       // Los tipos de datos "char" declaran caracteres
       
       char z='A', t='B';
       
       // Los tipos de datos "int" declaran un entero
       
       int x=2, y=2;
       
       // Los tipos de datos booleando dan salida false o true
       
       boolean resultado1, resultado2;
       
       // Aquí comienza el código
       
       System.out.println("Sabiendo que:\nz='A'\nt='B'\nx=2\ny=2");
       
       resultado1=x>y; // Comprobamos que x es mayor que y
       resultado2=z!=t; // Comprobamos que z no es igual que t
       System.out.println("El resultado de que \"x es mayor que y y z"
               + " no es igual a t\" es: " + (resultado1 && resultado2));
        
       resultado1='F'!=z; // Comprobamos que 'F' es distinto que z
       resultado2=x<100; // Comprobamos que x es menor que 100
       System.out.println("El resultado de que \"'F' es distinto de z y x"
               + " es menor que 100\" es: " + (resultado1 && resultado2));
       
       resultado1=t>z; // Comprobamos que t es mayor que z
       System.out.println("El resultado de que \"t es anterior "
               + "alfabéticamente a z\" es: " + (!resultado1));
       
    } // Fin main
    
} // Fin Ejercicio5
