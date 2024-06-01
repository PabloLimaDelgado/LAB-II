package EjercicioCinco;

public class PlatoComida {
    private String nombre;
    private int puntajePlato;

    public PlatoComida() {
    }

    public PlatoComida(String nombre, int puntajePlato) {
        this.nombre = nombre;
        this.puntajePlato = puntajePlato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntajePlato() {
        return puntajePlato;
    }

    public void setPuntajePlato(int puntajePlato) {
        this.puntajePlato = puntajePlato;
    }
}
