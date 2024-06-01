package EjercicioSiete.Persona;

import java.util.Date;

public class Esquiador extends Persona{
    private int idEsquiador;

    public Esquiador() {
    }

    public Esquiador(int DNI, int edad, Date nacimiento, String nombre, int idEsquiador) {
        super(DNI, edad, nacimiento, nombre);
        this.idEsquiador = idEsquiador;
    }

    public int getIdEsquiador() {
        return idEsquiador;
    }

    public void setIdEsquiador(int idEsquiador) {
        this.idEsquiador = idEsquiador;
    }
}
