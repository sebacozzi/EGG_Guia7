/** Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea
 * métodos para agregar nuevas recetas a la lista, para buscar una receta por
 * nombre y para obtener la lista de recetas que se pueden preparar con los
 * ingredientes disponibles en la cocina.
 */
package Entidad;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/**
 *
 * @author Sebastián Cozzi
 */
public class Cocina {

    private Receta[] recetas;
    private int contRecetas;

    public Cocina(int cantidadRecetas) {
        recetas = new Receta[cantidadRecetas];
        contRecetas = cantidadRecetas;
    }

    public Cocina() {
        recetas = new Receta[15];
        contRecetas = 15;
    }

    public void mostrarNombreRecetas() {
        System.out.println(" Recetas disponibles:");
        System.out.println("----------------------");
        if (recetas[0].getNombre().equals("")) {
            System.out.println("No hay recetas para mostrar.");
            return;
        }
        for (int i = 0; i < contRecetas; i++) {
            System.out.println("1) " + recetas[i].getNombre());
        }
        System.out.println("----------------------");
    }

    public void buscaReceta(String nombre) {
        int id = -1;
        for (int i = 0; i < contRecetas; i++) {
            if (recetas[i].getNombre().equalsIgnoreCase(nombre)) {
                id = i;
                break;
            }
        }
        if (id == -1) {
            System.out.println("No se encotraron recetas con el nombre %s.".formatted(nombre));
            return;
        }
        limpiaPantalla();
        System.out.println(recetas[id].toString());
    }

    private void limpiaPantalla() {
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
