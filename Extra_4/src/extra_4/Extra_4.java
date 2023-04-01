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

        String[] op = new String[4];
        boolean sMM = true;

        String[] op1 = new String[2];
        boolean sMB = true;

        String[] op2 = new String[3];
        boolean sMR = true;

        Cocina cocina = new Cocina();

        int n;

        op[0] = "Cargar Receta";
        op[1] = "Mostrar recetas";
        op[2] = "Listar recetas";
        op[3] = "Buscar receta";

        op1[0] = "Buscar por titulo";
        op1[1] = "Buscar por ingredientes";

        op2[0] = "Mostrar Nombres";
        op2[1] = "Mostrar todas las recetas";
        op2[2] = "Mostrar receta especifica";

        Menu mainMenu = new Menu("Menu Principal", op, "Salir");
        Menu menuBuscar = new Menu("Menu Buscar", op1, "Volver");
        Menu menuRecetas1 = new Menu("Menu Mostrar recetas", op2, "Volver");
        do {

            //  cls();
            System.out.println(mainMenu.toString());
            switch (mainMenu.pregunta(true)) {
                case 1: {/// carga las recetas
                    //cls();

                    System.out.println("Cargando recetas:");
                    System.out.println("--------------------------------");
                    System.out.print("Ingrese la cantidad de recetas a agregar: ");
                    n = leer.nextInt();
                    cocina.setCantidadRecetas(n);
                    cocina.creaRecetas();
                    mainMenu.esperaTecla();
                    break;
                }
                case 2: {
                    do {
                        System.out.println(menuRecetas1.toString());
                        switch (menuRecetas1.pregunta(true)) {
                            case 1: { /// mostrar nombres de recetas
                                cocina.mostrarNombreRecetas();
                                menuRecetas1.esperaTecla();
                                break;
                            }
                            case 2: { /// Mostrar todas las recetas
                                cocina.listarRecetas();
                                menuRecetas1.esperaTecla();
                                break;
                            }
                            case 3: { /// Menu con lista de nombres de recetas y muestra la receta elejida
                                String[] recetas = cocina.getTitulos();
                                Menu menuRecetas2 = new Menu("Lista de recetas", recetas, "Volver");
                                boolean sMR2 = true;
                                int Lrecetas = recetas.length;
                                do {
                                    System.out.println(menuRecetas2);
                                    if (menuRecetas2.pregunta(true) == Lrecetas + 1) {
                                        sMR2 = false;
                                    } else {
                                        System.out.println("receta " + menuRecetas2.getResultado());
                                        cocina.listarRecetas(menuRecetas2.getResultado() - 1);
                                        menuRecetas2.esperaTecla();
                                    }
                                } while (sMR2);
                                break;
                            }
                            case 4:
                                sMR = false;
                        }

                    } while (sMR);
                    break;
                }
                case 3: {  // muestra las recetas y espera que precionar enter
                    cocina.listarRecetas();
                    mainMenu.esperaTecla();
                    //cls();
                    break;
                }
                case 4: { /// sub menu buscar
                    do {
                        // cls();
                        System.out.println(menuBuscar.toString());
                        switch (menuBuscar.pregunta()) {
                            case 1 -> { /// busca receta por nombre
                                System.out.print("Ingrese el nombre de la receta: ");

                                cocina.buscaReceta(leer.nextLine());
                                menuBuscar.esperaTecla();
                            }
                            case 2 -> { /// busca receta por ingredientes
                                cocina.buscaReceta(cargaIngredientes());
                                menuBuscar.esperaTecla();
                            }
                            case 3 -> /// volver al menu principal
                                sMB = false;
                        }

                    } while (sMB);
                    break;
                }
                case 5:
                    sMM = false;
            }
        } while (sMM);
    }

    private static String[] cargaIngredientes() {
        Scanner leer = new Scanner(System.in);
        String[] ingredientes = new String[20];
        int l = 20;
        System.out.println("Ingrese ingrediente que tenga en la cocina\n(deje vacio para dejar de ingresar) ");
        for (int i = 0; i < ingredientes.length; i++) {
            System.out.print("Ingrediente %d: ".formatted(i + 1));
            ingredientes[i] = leer.nextLine();
            if (ingredientes[i].equalsIgnoreCase("")) {
                l = i + 1;
                break;
            }
        }
        String[] filtro = new String[l];
        System.arraycopy(ingredientes, 0, filtro, 0, l);

        if (ingredientes[0].equalsIgnoreCase("")) {
            System.out.println("No se cargaron ingredientes.");
        }

        return filtro;
    }
}
