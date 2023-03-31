/** Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea
 * métodos para agregar nuevas recetas a la lista, para buscar una receta por
 * nombre y para obtener la lista de recetas que se pueden preparar con los
 * ingredientes disponibles en la cocina.
 */
package extra_4;

import Entidad.Cocina;
import Menu.Menu;
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
        Scanner leer = new Scanner(System.in);

        String[] op = new String[6];
        boolean sMM = true;

        String[] op1 = new String[4];
        boolean sMB = true;

        Cocina cocina = new Cocina();

        int n;

        op[0] = "Menu Principal";
        op[1] = "Cargar Receta";
        op[2]= "Nombres de recetas";
        op[3] = "Listar recetas";
        op[4] = "Buscar receta";
        op[5] = "Salir";

        op1[0] = "Menu Buscar";
        op1[1] = "Buscar por titulo";
        op1[2] = "Buscar por ingredientes";
        op1[3] = "Volver";

        Menu mainMenu = new Menu(op);
        Menu menuBuscar = new Menu(op1);
        do {
            
          //  cls();
            System.out.println(mainMenu.toString());
            switch (mainMenu.pregunta()) {
                case 1 -> {
                    //cls();
                    
                    System.out.println("Cargando recetas:");
                    System.out.println("--------------------------------");
                    System.out.print("Ingrese la cantidad de recetas a agregar: ");
                    n = leer.nextInt();
                    cocina.setCantidadRecetas(n);
                    cocina.creaRecetas();
                }
                case 2 -> cocina.mostrarNombreRecetas();
                case 3 -> {
                    cocina.listarRecetas();
                    mainMenu.esperaTecla();
                    //cls();
                }
                case 4 -> {
                    do {
                       // cls();
                        System.out.println(menuBuscar.toString());
                        switch (menuBuscar.pregunta()) {
                            case 1 -> {
                                System.out.print("Ingrese el nombre de la receta: ");

                                cocina.buscaReceta(leer.nextLine());
                            }
                            case 2 -> {

                            }
                            case 3 ->
                                sMB = false;
                        }
                    } while (sMB);
                }
                case 5 ->
                    sMM = false;
            }
        } while (sMM);
    }

    private static void cls() {
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            System.out.flush();
        } catch (AWTException e) {
        }
    }
}
