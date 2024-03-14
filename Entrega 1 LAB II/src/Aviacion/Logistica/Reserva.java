package Aviacion.Logistica;

public class Reserva {
    public String asientoReservado;
    private int idReserva;

    public Reserva() {
    }

    public Reserva(String asientoReservado, int idReserva) {
        this.asientoReservado = asientoReservado;
        this.idReserva = idReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
}
