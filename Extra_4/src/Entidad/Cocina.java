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
    private String separador="--------------------------------------------------";
    

    public Cocina() {
    }

    public void setCantidadRecetas(int cantidad) {
        if (contRecetas != 0) {
            System.out.println("La cantidad de recetas ya esta asignada.");
            System.out.println(recetas[0]);
            return;
        }
        this.recetas = new Receta[cantidad];
        this.contRecetas = cantidad;
    }

    public void mostrarNombreRecetas() {
        System.out.println(  "          Recetas disponibles: " + recetas.length);
        System.out.println(separador);

        for (int i = 0; i < contRecetas; i++) {
            if ((recetas[i] != null)) {
                System.out.println((1+i)+") " + recetas[i].getNombre());
            }
            System.out.println(separador);
        }
        
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
    public void buscaReceta(String[] ingredientes){
        System.out.println(separador);
        if (recetas == null) return;
        for (Receta receta:recetas) {
            
            if (receta.ingredientesEnRecetaB(ingredientes)){                
                System.out.println(receta.toString());
                System.out.println(separador);
            }
        }
    }
    

    public void creaRecetas() {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < contRecetas; i++) {
            recetas[i] = new Receta();
            System.out.println("Ingrese el nombre de la receta: ");
            recetas[i].setNombre(leer.nextLine());
            recetas[i].aniadeIngrediente();
            recetas[i].aniadeProcedimiento();
            System.out.println(recetas[i].toString());
        }
    }

    public void listarRecetas() {
        if (recetas == null) {
            System.out.println("Primero ahi que cargar recetas.");
            return;
        }

        System.out.println("Lista de recetas: ");

        for (int i = 0; i < recetas.length; i++) {
            listarRecetas(i);
            System.out.println(separador);
        }

    }

    public void listarRecetas(int id) {
        if (recetas == null) {
            System.out.println("Primero ahi que cargar recetas.");
            return;
        }
        if (id >= 0 && id < recetas.length) {
            System.out.println(recetas[id].toString());
        }
    }

    public String[] getTitulos() {
        String[] lista = new String[this.contRecetas];
        for (int i = 0; i < contRecetas; i++) {
            lista[i] = recetas[i].getNombre();
        }
        return lista;
    }
}
