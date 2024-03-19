package Aviacion.Logistica;
import java.util.ArrayList;

public class Avion {

    private int capacidadAsientos;
    public String marcaAvion;
    private Vuelo vuelo;
    private Flota flota;
    public Avion() {
    }

    public Avion(int capacidadAsientos, String marcaAvion, String flota) {
        this.capacidadAsientos = capacidadAsientos;
        this.marcaAvion = marcaAvion;
        this.flota = new Flota(flota);
    }

    public int getCapacidadAsientos() {
        return capacidadAsientos;
    }

    public void setCapacidadAsientos(int capacidadAsientos) {
        this.capacidadAsientos = capacidadAsientos;
    }

    public void despegar(){

    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Flota getFlota() {
        return flota;
    }

    public void setFlota(Flota flota) {
        this.flota = flota;
    }
}
