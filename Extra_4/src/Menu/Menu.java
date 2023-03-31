/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Sebastián Cozzi
 */
public class Menu {
    private String[] items;
    private String titulo;
    private int resultado;
    
    public Menu(String[] items) {
        this.items = items;
        this.titulo = items[0];
        resultado=-1;
    }

    public void setItems(String[] items) {
        this.items = items;
        this.titulo = items[0];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getResultado() {
        return resultado;
    }
    
    public int pregunta(){
        Scanner leer = new Scanner(System.in);
        resultado=leer.nextInt();
        return resultado;
    }
    
    @Override
    public String toString() {
        String m;
        System.out.println(titulo);
        m=titulo + "\n-----------------";
        for (int i = 1; i < items.length; i++){
            m= m + "\n %d) %s.".formatted(i, items[i]);
        }
        m = m + "\nElija una Opción: ";
        return m;
    }
    public void esperaTecla(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Precione una tecla para continuar.");
        leer.nextLine();
    }
    
}
