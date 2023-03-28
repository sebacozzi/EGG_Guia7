/*Declarar una clase llamada Circunferencia que tenga como atributo privado el 
radio de tipo real. A continuaci�n, se deben crear los siguientes m�todos:
    a) M�todo constructor que inicialice el radio pasado como par�metro.
    b) M�todos get y set para el atributo radio de la clase Circunferencia.
    c) M�todo para crearCircunferencia(): que le pide el radio y lo guarda 
        en el atributo del objeto.
    d) M�todo area(): para calcular el �rea de la circunferencia (Area=??*radio?^2).
    e) M�todo perimetro(): para calcular el per�metro (Perimetro=2*?*radio).

 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Sebasti�n Cozzi
 */
public class Circunferencia {

    private float radio;
    
    private float v_area;
    
    private float v_perimetro;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public float getRedio() {
        return radio;
    }

    public void setRedio(float redio) {
        this.radio = redio;
    }

    public void crearCircunferencia() {
        System.out.print("Ingrese el radio de la circunferencia: ");
        Scanner leer = new Scanner(System.in);
        radio = leer.nextFloat();
    }

    public void area() {
        v_area = (float) (Math.PI * (radio * radio));
    }

    public void perimetro() {
        v_perimetro = (float) (Math.PI * (radio * 2));
    }

    public float getArea() {
        if (v_area==0) {
            area();
        }
        return v_area;
    }

    public float getPerimetro() {
        if (v_perimetro==0) {
            perimetro();
        }
        return v_perimetro;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + ", area=" + v_area + ", perimetro=" + v_perimetro + '}';
    }
    
}
