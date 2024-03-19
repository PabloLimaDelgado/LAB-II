package Aviacion.Reserva;
public class Reserva {
    private String asiento;
    private float fecha;

    public Reserva() {
    }

    public Reserva(String asiento, float fecha) {
        this.asiento = asiento;
        this.fecha = fecha;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public float getFecha() {
        return fecha;
    }

    public void setFecha(float fecha) {
        this.fecha = fecha;
    }
}
