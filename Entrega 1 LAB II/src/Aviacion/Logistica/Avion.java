package Aviacion.Logistica;

public class Avion {
    private int capacidadAsientos;
    public String marcaAvion;
    private Reserva reserva;

    public Avion() {
    }

    public Avion(int capacidadAsientos, String marcaAvion) {
        this.capacidadAsientos = capacidadAsientos;
        this.marcaAvion = marcaAvion;
    }

    public int getCapacidadAsientos() {
        return capacidadAsientos;
    }

    public void setCapacidadAsientos(int capacidadAsientos) {
        this.capacidadAsientos = capacidadAsientos;
    }

    public void despegar(){

    }

    public void reservarAsiento(Reserva reserva){
        this.reserva = reserva;
    }


}
