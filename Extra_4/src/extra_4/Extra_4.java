/**Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea 
 * métodos para agregar nuevas recetas a la lista, para buscar una receta por 
 * nombre y para obtener la lista de recetas que se pueden preparar con los 
 * ingredientes disponibles en la cocina.
 */
package extra_4;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    
    private static int menu(){
        Scanner leer = new Scanner(System.in);
        int op;
        boolean salir;
        do{
        System.out.println("""
                           Menu Principal
                           -----------------------------
                           Opciones: 
                           1) Cargar recetas.
                           2) Mostrar todas las tecetas
                           3) Buscar receta.
                           0) Salir""");
        op=leer.nextInt();
        salir = op==0 || op==1 || op==2 || op==3;
            if (!salir) {
                limpiaPantalla();
                System.out.println("Opción incorrecta.");
            }
        }while (!salir);
        return op;
    }
    
    private static void limpiaPantalla() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        } catch (AWTException e) {
        }
    }
}
