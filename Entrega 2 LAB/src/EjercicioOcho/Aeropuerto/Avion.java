package EjercicioOcho.Aeropuerto;

public class Avion {
    private int capacidad;
    private String matricula;
    private int peso;
    private TipoAvion tipoAvion;

    public Avion() {
    }
    public Avion(int capacidad, String matricula, int peso, TipoAvion tipoAvion) {
        this.capacidad = capacidad;
        this.matricula = matricula;
        this.peso = peso;
        this.tipoAvion = tipoAvion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public TipoAvion getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(TipoAvion tipoAvion) {
        this.tipoAvion = tipoAvion;
    }
}
