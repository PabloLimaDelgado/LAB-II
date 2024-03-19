package Aviacion.Logistica;

public class Vuelo {
    private float horarioLlegada;
    private float horarioSalida;
    private int idVuelo;
    private float tiempoVuelo;

    public Vuelo() {
    }

    public Vuelo(float horarioLlegada, float horarioSalida, int idVuelo, float tiempoVuelo) {
        this.horarioLlegada = horarioLlegada;
        this.horarioSalida = horarioSalida;
        this.idVuelo = idVuelo;
        this.tiempoVuelo = tiempoVuelo;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }
}
