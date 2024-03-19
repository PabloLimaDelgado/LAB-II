package Aviacion.Reserva;

import java.util.ArrayList;

public class Vuelo {
    private int idVuelo;
    private ArrayList <Reserva> reservaVuelo = new ArrayList<Reserva>();

    public Vuelo() {
    }

    public Vuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public void agregarVuelo(Reserva reserva){
        reservaVuelo.add(reserva);
    }

    public ArrayList<Reserva> getReservaVuelo() {
        return reservaVuelo;
    }
}
