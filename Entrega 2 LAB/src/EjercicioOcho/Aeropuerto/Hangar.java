package EjercicioOcho.Aeropuerto;

import java.util.ArrayList;

public class Hangar {
    ArrayList <Avion> avionesEstacionados = new ArrayList<>();
    private int capacidad;
    private String numero;
    private String ubicacion;

    public Hangar(int capacidad, String numero, String ubicacion) {
        this.capacidad = capacidad;
        this.numero = numero;
        this.ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void meterAvion(Avion avion){
        avionesEstacionados.add(avion);
    }

    public void mostrarAviones(){
        for (Avion avion: avionesEstacionados){
            System.out.println(avion.getMatricula());
        }
    }
}
