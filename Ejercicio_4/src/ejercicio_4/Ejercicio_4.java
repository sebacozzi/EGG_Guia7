/**Crear una clase Rectángulo que modele rectángulos por medio de un atributo 
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario. 
 * También incluirá un método para calcular la superficie del rectángulo y un 
 * método para calcular el perímetro del rectángulo. Por último, tendremos un 
 * método que dibujará el rectángulo mediante asteriscos usando la base y la 
 * altura. Se deberán además definir los métodos getters, setters y constructores
 * correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package ejercicio_4;

import Entidad.Rectangulo;

/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_4 {

    public static void main(String[] args) {
        Rectangulo rect1=new Rectangulo();
        Rectangulo rect2=new Rectangulo(10,5);
        Rectangulo rect3=new Rectangulo();
        rect1.setAltura(15);
        rect1.setBase(15);
        rect3.crearRectangulo();
        System.out.println(rect1);
        rect1.dibuja();
        System.out.println("");
        System.out.println(rect2);
        rect2.dibuja();
        System.out.println(""); 
        System.out.println(rect3);
        rect3.dibuja();
        System.out.println("");
    }
    
}
