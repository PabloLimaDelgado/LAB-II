package Aviacion.Logistica;

public class Vuelo {
    private float horarioLlegada;
    private float horarioSalida;
    private int idVuelo;
    private float tiempoVuelo;
    private Avion avion;

    public Vuelo() {
    }

    public Vuelo(float horarioLlegada, float horarioSalida, int idVuelo, float tiempoVuelo,Avion avion) {
        this.horarioLlegada = horarioLlegada;
        this.horarioSalida = horarioSalida;
        this.idVuelo = idVuelo;
        this.tiempoVuelo = tiempoVuelo;
        this.avion = avion;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }
}
