package EjercicioTres.Impuestos;

public abstract class Impuesto {
    private long id;
    private int montoRecaudado;

    public Impuesto() {
    }
    public Impuesto(long id, int montoRecaudado) {
        this.id = id;
        this.montoRecaudado = montoRecaudado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMontoRecaudado() {
        return montoRecaudado;
    }

    public void setMontoRecaudado(int montoRecaudado) {
        this.montoRecaudado = montoRecaudado;
    }
}
