/**Definir una clase llamada Puntos que contendr� las coordenadas de dos puntos,
 * sus atributos ser�n, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
 * objeto puntos usando un m�todo crearPuntos() que le pide al usuario los dos 
 * n�meros y los ingresa en los atributos del objeto. Despu�s, a trav�s de otro 
 * m�todo calcular y devolver la distancia que existe entre los dos puntos que 
 * existen en la clase Puntos. Para conocer como calcular la distancia entre 
 * dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package extra_2;

import Entidad.Puntos;

/**
 *
 * @author Sebasti�n Cozzi
 */
public class Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Text Clase Puntos
        Puntos cord=new Puntos();
        cord.creaPuntos();
        System.out.println("La distancia entre el punto 1 y 2 es: "+ cord.calcularDistancia());
        System.out.println("Raiz cuadrada de "+ cord.Distancia2());
    }
    
}
