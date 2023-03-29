/**Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea 
 * métodos para agregar nuevas recetas a la lista, para buscar una receta por 
 * nombre y para obtener la lista de recetas que se pueden preparar con los 
 * ingredientes disponibles en la cocina.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Sebastián Cozzi
 */
public class Receta {
    private String nombre;
    private ArrayList<String> ingredientes;
    private ArrayList<String> cantidades;
    private String procedimiento;
    private int contIngredientes;
}
