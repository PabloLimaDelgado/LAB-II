//import Aviacion.Logistica.Avion;
//import Aviacion.Logistica.Reserva;
//import Aviacion.Logistica.Vuelo;
//import Aviacion.Personal.Piloto;
import Aviacion.Reserva.*;
public class Main {
    public static void main(String[] args) {
        /*Avion a1 = new Avion(50,"Boeing", "Panama");

        Vuelo v1 = new Vuelo(12.30f, 11.00f, 14, 2.0f);

        Reserva r1 = new Reserva("A22", 3141);

        Piloto p1 = new Piloto(22, 43829992,"Pablo Lima", 1000, "Latam");

        a1.setVuelo(v1);
        r1.agregarVuelo(v1);

        System.out.println("Flota: " + a1.getFlota().getFlota());
        System.out.println("Vuelo: " + a1.getVuelo().getIdVuelo());
        System.out.println("Vuelo reserva: " + r1.getVuelo().getIdVuelo());

        p1.formaVolar("Avion"); */

        Vuelo v2 = new Vuelo(1123);
        Reserva r2 = new Reserva("A22", 12f);
        Reserva r3 = new Reserva("A23", 13f);

        v2.agregarVuelo(r2);
        v2.agregarVuelo(r3);

        System.out.println(v2.getReservaVuelo());
    }
}