package EjercicioOcho.Acciones;

import EjercicioOcho.Aeropuerto.Avion;
import EjercicioOcho.Persona.Propietario;

import java.util.Date;

public class FechaAdquisicion {
    private Avion avion;
    private Date fecha;
    private Propietario propietario;

    public FechaAdquisicion() {
    }

    public FechaAdquisicion(Avion avion, Date fecha, Propietario propietario) {
        this.avion = avion;
        this.fecha = fecha;
        this.propietario = propietario;
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

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
