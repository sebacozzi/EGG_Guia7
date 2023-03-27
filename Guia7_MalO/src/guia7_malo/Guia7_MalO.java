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
        persona_1 = new Persona("Sebastián","28524714", LocalDate.of(1980,12,30));
        
        
        System.out.println(persona_1);
        
    }

    
}
