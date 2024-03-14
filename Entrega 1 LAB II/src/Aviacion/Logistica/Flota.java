package Aviacion.Logistica;

public class Flota {
    private String flota;
    private Avion avion;
    public Flota() {

    }

    public Flota(String flota, int capacidadAsientos, String marcaAvion) {
        this.flota = flota;
        this.avion = new Avion(capacidadAsientos, marcaAvion);

    }

    public void agregarAvion(int capacidadAsientos, String marcaAvion){
        Avion nuevoAvion = new Avion(capacidadAsientos, marcaAvion);
        this.avion = nuevoAvion;
    }
}
