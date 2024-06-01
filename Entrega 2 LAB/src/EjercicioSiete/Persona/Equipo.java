package EjercicioSiete.Persona;

public class Equipo {
    private String nombreEquipo;
    private Esquiador esquiadores[];
    private Entrenador entrenador;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, Esquiador[] esquiadores) {
        this.nombreEquipo = nombreEquipo;
        this.esquiadores = esquiadores;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Esquiador[] getEsquiadores() {
        return esquiadores;
    }

    public void setEsquiadores(Esquiador[] esquiadores) {
        this.esquiadores = esquiadores;
    }


    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void agregarEntrenador(Entrenador entrenador){
        this.entrenador = entrenador;
    }
}
