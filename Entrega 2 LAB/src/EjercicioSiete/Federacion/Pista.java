package EjercicioSiete.Federacion;

public class Pista {
    private Dificultad dificultad;
    private double longitudKm;

    public Pista() {
    }

    public Pista(Dificultad dificultad, double longitudKm) {
        this.dificultad = dificultad;
        this.longitudKm = longitudKm;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public double getLongitudKm() {
        return longitudKm;
    }

    public void setLongitudKm(double longitudKm) {
        this.longitudKm = longitudKm;
    }
}
