/**Desarrollar una clase Cancion con los siguientes atributos: t�tulo y autor. 
 * Se deber� definir adem�s dos constructores: uno vac�o que inicializa el 
 * t�tulo y el autor a cadenas vac�as y otro que reciba como par�metros el
 * t�tulo y el autor de la canci�n. Se deber�n adem�s definir los m�todos 
 * getters y setters correspondientes.
 */
package extra_1;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author Sebasti�n Cozzi
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
