/** Crea una clase "Juego" que tenga un m�todo "iniciar_juego" que permita a dos
 * jugadores jugar un juego de adivinanza de n�meros. El primer jugador elige un
 * n�mero y el segundo jugador intenta adivinarlo. El segundo jugador tiene un
 * n�mero limitado de intentos y recibe una pista de "m�s alto" o "m�s bajo"
 * despu�s de cada intento. El juego termina cuando el segundo jugador adivina
 * el n�mero o se queda sin intentos. Registra el n�mero de intentos necesarios
 * para adivinar el n�mero y el n�mero de veces que cada jugador ha ganado.
 */
package Entidad;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 *
 * @author Sebasti�n Cozzi
 */
public class Juego {

    private final Scanner leer;
    private int nAdivinar;
    private int intentos;
    private int puntosJ1;
    private int puntosJ2;

    public Juego() {
        nAdivinar = 0;
        intentos = 0;
        puntosJ1 = 0;
        puntosJ2 = 0;
        leer = new Scanner(System.in);
    }

    private void solicita_numero() {
        System.out.print("Ingrese el n�mero a adivinar: ");
        nAdivinar = leer.nextInt();
        System.out.print("Ingrese la cantidad de intentos que tiene para adivinar: ");
        intentos = leer.nextInt();
    }

    public void iniciar_juego() {
        do {
            this.solicita_numero();
            this.limpiaPantalla();
            this.turnoP2();
        } while (this.salir());

        this.mostrarPuntos();
    }

    private void turnoP2() {
        int n;
        System.out.println("Jugador 2");
        for (int i = 0; i < intentos; i++) {
            if ((i + 1) == intentos) {
                System.out.println("Ultima Oportunidad!!!");
            }
            System.out.print("Ingrese un n�mero: (" + (i + 1) + "/" + intentos + ")");
            n = leer.nextInt();
            if (i < intentos - 1) {
                if (n == nAdivinar) {
                    System.out.println("Acertaste, el n�mero buscado era: " + nAdivinar);
                    puntosJ2++;
                    return;
                } else if (n < nAdivinar) {
                    System.out.println("M�s Alto!");
                } else {
                    System.out.println("M�s Bajo!");
                }
            }
        }
        puntosJ1++;
    }

    private boolean salir() {
        System.out.print("Desea continuar jugando? (s/n) ");
        return leer.next().equalsIgnoreCase("s");
    }

    private void mostrarPuntos() {
        System.out.println("Puntos obtenidos:");
        System.out.println("Jugador 1: " + puntosJ1);
        System.out.println("Jugador 2: " + puntosJ2);
        System.out.println("Gracias por participar!!");
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
