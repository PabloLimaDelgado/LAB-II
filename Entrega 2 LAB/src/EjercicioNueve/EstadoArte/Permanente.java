package EjercicioNueve.EstadoArte;

import java.util.Date;

public class Permanente {
    private int coste;
    private TipoPermanente dondeEsta;
    private Date fechaAdquisicion;

    public Permanente() {
    }

    public Permanente(int coste, TipoPermanente dondeEsta, Date fechaAdquisicion) {
        this.coste = coste;
        this.dondeEsta = dondeEsta;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public TipoPermanente getDondeEsta() {
        return dondeEsta;
    }

    public void setDondeEsta(TipoPermanente dondeEsta) {
        this.dondeEsta = dondeEsta;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }
}
