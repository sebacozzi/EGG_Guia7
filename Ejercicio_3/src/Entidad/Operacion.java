/** Crear una clase llamada Operacion que tenga como atributos privados numero1
 * y numero2. A continuaci�n, se deben crear los siguientes m�todos:
 * a) M�todo constructor con todos los atributos pasados por par�metro.
 * b) M�todo constructor sin los atributos pasados por par�metro.
 * c) M�todos get y set.
 * d) M�todo para crearOperacion(): que le pide al usuario los dos n�meros y
 * los guarda en los atributos del objeto.
 * e) M�todo sumar(): calcular la suma de los n�meros y devolver el resultado
 * al main.
 * f) M�todo restar(): calcular la resta de los n�meros y devolver el resultado
 * al main
 * g) M�todo multiplicar(): primero valida que no se haga una multiplicaci�n
 * por cero, si fuera a multiplicar por cero, el m�todo devuelve 0 y se le
 * informa al usuario el error. Si no, se hace la multiplicaci�n y se
 * devuelve el resultado al main
 * h) M�todo dividir(): primero valida que no se haga una divisi�n por cero, si
 * fuera a pasar una divisi�n por cero, el m�todo devuelve 0 y se le informa
 * al usuario el error se le informa al usuario. Si no, se hace la divisi�n
 * y se devuelve el resultado al main.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Sebasti�n Cozzi
 */
public class Operacion {

    private int numero1;

    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el primer numero para los calculos: ");
        numero1 = leer.nextInt();

        System.out.print("Ingrese el segundo n�mero para los calculos: ");
        numero2 = leer.nextInt();
    }

    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }

    public float dividir() {
        float n1=(float)numero1;
        float n2=(float)numero2;
        if ((numero2 == 0) || (numero1 == 0)) {
            System.out.println("Error. Divisi�n por 0.");
            return 0;
        } else {
            return n1 / n2;
        }
    }

    public int multiplicar() {
        if ((numero2 == 0) || (numero1 == 0)) {
            System.out.println("Error. Multiplicaci�n por 0.");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    @Override
    public String toString() {
        return "Operacion{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
}
