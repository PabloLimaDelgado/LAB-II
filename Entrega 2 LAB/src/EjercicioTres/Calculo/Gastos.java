package EjercicioTres.Calculo;

public class Gastos {
    private String detalle;
    private long id;
    private double informeGastos;

    public Gastos() {
    }
    public Gastos(String detalle, long id, double informeGastos) {
        this.detalle = detalle;
        this.id = id;
        this.informeGastos = informeGastos;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getInformeGastos() {
        return informeGastos;
    }

    public void setInformeGastos(double informeGastos) {
        this.informeGastos = informeGastos;
    }
}
