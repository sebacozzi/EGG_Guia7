/**Crea una clase "Juego" que tenga un m�todo "iniciar_juego" que permita a dos 
 * jugadores jugar un juego de adivinanza de n�meros. El primer jugador elige un
 * n�mero y el segundo jugador intenta adivinarlo. El segundo jugador tiene un 
 * n�mero limitado de intentos y recibe una pista de "m�s alto" o "m�s bajo" 
 * despu�s de cada intento. El juego termina cuando el segundo jugador adivina 
 * el n�mero o se queda sin intentos. Registra el n�mero de intentos necesarios 
 * para adivinar el n�mero y el n�mero de veces que cada jugador ha ganado.
 */
package extra_3;

import Entidad.Juego;

/**
 *
 * @author Sebasti�n Cozzi
 */
public class Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test Clase Juego
        Juego Play=new Juego();
        Play.iniciar_juego();
    }
    
}
