package EjercicioSiete.Persona;

import java.util.Date;

public class Entrenador extends Persona{
    private int añosExperiencia;

    public Entrenador() {
    }

    public Entrenador(int DNI, int edad, Date nacimiento, String nombre, int añosExperiencia) {
        super(DNI, edad, nacimiento, nombre);
        this.añosExperiencia = añosExperiencia;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
}
