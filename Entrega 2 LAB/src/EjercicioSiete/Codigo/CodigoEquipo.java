package EjercicioSiete.Codigo;

import EjercicioSiete.Persona.Equipo;
import EjercicioSiete.Prueba.PruebaPorEquipo;

public class CodigoEquipo {
    private Equipo equipo;
    private int idEquipo;
    private PruebaPorEquipo nombrePrueba;

    public CodigoEquipo() {
    }

    public CodigoEquipo(Equipo equipo, int idEquipo, PruebaPorEquipo nombrePrueba) {
        this.equipo = equipo;
        this.idEquipo = idEquipo;
        this.nombrePrueba = nombrePrueba;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public PruebaPorEquipo getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(PruebaPorEquipo nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }
}
