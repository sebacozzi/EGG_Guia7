/**Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos 
 * jugadores jugar un juego de adivinanza de números. El primer jugador elige un
 * número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un 
 * número limitado de intentos y recibe una pista de "más alto" o "más bajo" 
 * después de cada intento. El juego termina cuando el segundo jugador adivina 
 * el número o se queda sin intentos. Registra el número de intentos necesarios 
 * para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package extra_3;

import Entidad.Juego;

/**
 *
 * @author Sebastián Cozzi
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
