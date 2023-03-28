package ejercicio_2;
 import Entidad.Circunferencia;
/**
 *
 * @author Sebastián Cozzi
 */
public class Ejercicio_2 {
    public static void main(String[] args) {
        Circunferencia circulo= new Circunferencia();
        circulo.crearCircunferencia();
        circulo.area();
        circulo.perimetro();
        System.out.println(circulo.toString());
        System.out.println(circulo.getClass());
        System.out.println("Perimetro del circulo: " + circulo.getPerimetro());
    }
    
}
