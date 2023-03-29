/**Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
 * Se deberá definir además dos constructores: uno vacío que inicializa el 
 * título y el autor a cadenas vacías y otro que reciba como parámetros el
 * título y el autor de la canción. Se deberán además definir los métodos 
 * getters y setters correspondientes.
 */
package extra_1;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Extra_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /// Test Clase Cancion
        Cancion song1=new Cancion();
        Cancion song2=new Cancion("Titulo 2","Autor 2");
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la titulo 1: ");
        song1.setTitulo(leer.next());
        System.out.println("ingrese la Autor 1: ");
        song1.setAutor(leer.next());
        
        System.out.println("Cancion 1:\n Titulo= "+ song1.getTitulo()+"\n Autor= " + song1.getAutor());
        System.out.println("Cancion 2:\n Titulo= "+ song2.getTitulo()+"\n Autor= " + song2.getAutor());
        
    }
    
}
