package EjercicioSiete.Prueba;

import java.util.Date;

public class PruebaPorEquipo extends Prueba {
    private int duracionHoras;
    private Date fecha;
    private String[] podioEquipos;

    public PruebaPorEquipo() {
    }

    public PruebaPorEquipo(String nombrePrueba, int idPrueba, TipoPrueba tipoPrueba, int duracionHoras, Date fecha, String[] podioEquipos) {
        super(nombrePrueba, idPrueba, tipoPrueba);
        this.duracionHoras = duracionHoras;
        this.fecha = fecha;
        this.podioEquipos = podioEquipos;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String[] getPodioEquipos() {
        return podioEquipos;
    }

    public void setPodioEquipos(String[] podioEquipos) {
        this.podioEquipos = podioEquipos;
    }
}
