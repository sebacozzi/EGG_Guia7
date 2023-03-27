package Entidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Sebastián Cozzi
 */
public class Persona {

    private String nombre;

    private String dni;

    private LocalDate fechaNacimiento;
    
    private int anios;

    public Persona(String nombre, String dni, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.anios = getEdad();
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona:\n nombre= " 
                + nombre + ".\n dni= " + dni + 
                ".\n Fecha de nacimiento= " + 
                fechaNacimiento.format(DateTimeFormatter.ofPattern("dd/M/yyyy")) +
                ".\n Tu edad es= "+anios+".";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        this.anios = getEdad();
    }
    public int getEdad(){
        return (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
        
    }
}
