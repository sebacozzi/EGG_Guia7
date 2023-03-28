/**Crear una clase llamada Operacion que tenga como atributos privados numero1 
 * y numero2. A continuación, se deben crear los siguientes métodos:
    a) Método constructor con todos los atributos pasados por parámetro.
    b) Método constructor sin los atributos pasados por parámetro.
    c) Métodos get y set.
    d) Método para crearOperacion(): que le pide al usuario los dos números y 
    * los guarda en los atributos del objeto.
    e) Método sumar(): calcular la suma de los números y devolver el resultado
    * al main.
    f) Método restar(): calcular la resta de los números y devolver el resultado
    * al main
    g) Método multiplicar(): primero valida que no se haga una multiplicación 
    * por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le
    * informa al usuario el error. Si no, se hace la multiplicación y se 
    * devuelve el resultado al main
    Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
package ejercicio_3;

import Entidad.Operacion;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
        
        Operacion calculo= new Operacion();
        
        Operacion calculo1= new Operacion(10,18);
        
        calculo.crearOperacion();
        
        System.out.println("");
        System.out.println(calculo);
        System.out.println(" Suma: "+ calculo.sumar());
        System.out.println(" Resta: "+ calculo.restar());
        System.out.println(" Multiplicación: "+ calculo.multiplicar());
        System.out.println(" División: "+ calculo.dividir());
        System.out.println("*****************");
        System.out.println(calculo1);
        System.out.println(" Suma: "+ calculo1.sumar());
        System.out.println(" Resta: "+ calculo1.restar());
        System.out.println(" Multiplicación: "+ calculo1.multiplicar());
        System.out.println(" División: "+ calculo1.dividir());
        
    }
    
}
