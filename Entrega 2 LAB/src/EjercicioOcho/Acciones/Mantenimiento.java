package EjercicioOcho.Acciones;

import EjercicioOcho.Aeropuerto.Avion;
import EjercicioOcho.Persona.Mecanico;

import java.util.Date;

public class Mantenimiento {
    private Avion avion;
    private Date fecha;
    private int horasInvertidas;
    private Mecanico mecanico;
    private String tipoTrabajo;

    public Mantenimiento() {
    }

    public Mantenimiento(Avion avion, Date fecha, int horasInvertidas, Mecanico mecanico, String tipoTrabajo) {
        this.avion = avion;
        this.fecha = fecha;
        this.horasInvertidas = horasInvertidas;
        this.mecanico = mecanico;
        this.tipoTrabajo = tipoTrabajo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getHorasInvertidas() {
        return horasInvertidas;
    }

    public void setHorasInvertidas(int horasInvertidas) {
        this.horasInvertidas = horasInvertidas;
    }

    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }
}
