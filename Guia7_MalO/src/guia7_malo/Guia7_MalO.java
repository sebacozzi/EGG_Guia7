/**
 */
package guia7_malo;

import Entidad.Persona;
import java.time.LocalDate;

/**
 *
 * @author Sebastián Cozzi
 */
public class Guia7_MalO {
    public static void main(String[] args) {
        Persona persona_1;
        persona_1 = new Persona("Sebastián","12345678", LocalDate.of(1990,11,24));
        
        
        System.out.println(persona_1);
        
    }

    
}
