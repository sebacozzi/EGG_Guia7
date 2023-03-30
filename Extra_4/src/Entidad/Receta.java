/** Crea una clase "Cocina" que tenga una lista de objetos "Receta". Luego, crea
 * métodos para agregar nuevas recetas a la lista, para buscar una receta por
 * nombre y para obtener la lista de recetas que se pueden preparar con los
 * ingredientes disponibles en la cocina.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Receta {

    private String nombre;
    private String[][] ingredientes;
    private String procedimiento;
    private int contIngredientes;

    public Receta(int ingredientes) {
        this.ingredientes = new String[ingredientes][2];
        contIngredientes = ingredientes;
        limpiaIngredientes();
    }

    /// Crea los array de ingredientes y cantidades en 15
    public Receta() {
        ingredientes = new String[15][2];
        contIngredientes = 15;
        limpiaIngredientes();
    }
    /// pone los ingredientes y cantidades en vacio ("")
    private void limpiaIngredientes() {
        for (int i = 0; i < contIngredientes; i++) {
            ingredientes[i][0] = "";
            ingredientes[i][1] = "";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String[][] getIngredientes() {
        return ingredientes;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    @Override
    public String toString() {
        String receta;
        int ling = 0, k = 0;
        int espacios;
        receta = "Receta de " + nombre + "\n" + "Ingredientes:\n";
        for (int i = 0; i < contIngredientes; i++) {
            if (ingredientes[i][0].length() > ling) {
                ling = ingredientes[i][0].length();
            }
        }
        if (ling==0) {
            return "La receta no tiene ingredientes";
        }
        for (int i = 0; i < ling; i++) {
            receta = receta + "  " + ingredientes[i][0];
            espacios = (ling - ingredientes[i][0].length()) + 2;
            for (int j = 0; j < espacios; j++) {
                receta = receta + " ";
            }
            receta = receta + ingredientes[i][1] + "\n";
        }
        receta = receta + "Procedimiento:\n";
        for (int i = 0; i < procedimiento.length(); i++) {
            if ((k >= 50) && (procedimiento.substring(i, i + 1) == " ")) {
                k = 0;
                receta = receta + "\n ";
            } else {
                receta = receta + procedimiento.substring(i, i + 1);
            }
            k++;/// es para realizar un salto de linea después de cierta cantidad de caracteres (50) pero continua hasta que encuentre un espacio
        }
        return receta;
    }

    public void aniadeIngrediente() {
        // inicialización de Scanner
        int id=1;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los ingredientes");
        System.out.println("------------------------");
        do{
            System.out.print("Ingrediente "+ id + ": ");
            ingredientes[id-1][0]=leer.nextLine();
            System.out.print("Cantidad del ingrediente "+ id + ": ");
            ingredientes[id-1][1]=leer.nextLine();
            System.out.println("");
            System.out.println("¿Desea agregar mas ingredientes? (s/n) ");
            if (leer.next().equalsIgnoreCase("s")) {
                break;
            }else id++;

        }while(id<contIngredientes);
            contIngredientes=id;
    }
    public void aniadeProcedimiento(){
        // inicialización de Scanner
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el procedimiento para realizar la receta:");
        procedimiento=leer.nextLine();
    }
    
}
