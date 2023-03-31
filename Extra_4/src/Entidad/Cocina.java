/** Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea
 * métodos para agregar nuevas recetas a la lista, para buscar una receta por
 * nombre y para obtener la lista de recetas que se pueden preparar con los
 * ingredientes disponibles en la cocina.
 */
package Entidad;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Cocina {

    private Receta[] recetas;
    private int contRecetas;

    public Cocina() {
    }
    
    
    public void setCantidadRecetas(int cantidad){
        if (contRecetas!=0){
            System.out.println("La cantidad de recetas ya esta asignada.");
            System.out.println(recetas[0]);
            return;
        }
        this.recetas = new Receta[cantidad];
        this.contRecetas = cantidad;
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
        //limpiaPantalla();
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

    public void creaRecetas() {
        Scanner leer = new Scanner(System.in);
        for (Receta receta : recetas) {
            receta= new Receta();
            System.out.println("Ingrese el nombre de la receta: ");
            receta.setNombre(leer.nextLine());
            receta.aniadeIngrediente();
            receta.aniadeProcedimiento();
            System.out.println(receta.toString());
        }
    }
    public void listarRecetas(){
        if (recetas == null) {
            System.out.println("Primero ahi que cargar recetas.");
            return;
        }
        
        System.out.println("Lista de recetas: ");
        
        for (int i = 0; i < recetas.length; i++) {
             System.out.println(recetas[i].toString());
             System.out.println("-------------------------------------------------------");}
        
    }
    public String[] getTitulos(){
        String[] lista=new String[this.contRecetas];
        for (int i = 0; i < contRecetas; i++) {
            lista[i]=recetas[i].getNombre();
        }
        return lista;
    }
}
