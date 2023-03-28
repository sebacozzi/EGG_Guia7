/**Crear una clase llamada Operacion que tenga como atributos privados numero1 
 * y numero2. A continuaci�n, se deben crear los siguientes m�todos:
    a) M�todo constructor con todos los atributos pasados por par�metro.
    b) M�todo constructor sin los atributos pasados por par�metro.
    c) M�todos get y set.
    d) M�todo para crearOperacion(): que le pide al usuario los dos n�meros y 
    * los guarda en los atributos del objeto.
    e) M�todo sumar(): calcular la suma de los n�meros y devolver el resultado
    * al main.
    f) M�todo restar(): calcular la resta de los n�meros y devolver el resultado
    * al main
    g) M�todo multiplicar(): primero valida que no se haga una multiplicaci�n 
    * por cero, si fuera a multiplicar por cero, el m�todo devuelve 0 y se le
    * informa al usuario el error. Si no, se hace la multiplicaci�n y se 
    * devuelve el resultado al main
    M�todo dividir(): primero valida que no se haga una divisi�n por cero, si fuera a pasar una divisi�n por cero, el m�todo devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la divisi�n y se devuelve el resultado al main.

 */
package ejercicio_3;

import Entidad.Operacion;

/**
 *
 * @author Sebasti�n Cozzi
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
        System.out.println(" Multiplicaci�n: "+ calculo.multiplicar());
        System.out.println(" Divisi�n: "+ calculo.dividir());
        System.out.println("*****************");
        System.out.println(calculo1);
        System.out.println(" Suma: "+ calculo1.sumar());
        System.out.println(" Resta: "+ calculo1.restar());
        System.out.println(" Multiplicaci�n: "+ calculo1.multiplicar());
        System.out.println(" Divisi�n: "+ calculo1.dividir());
        
    }
    
}
