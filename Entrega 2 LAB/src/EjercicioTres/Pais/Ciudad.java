package EjercicioTres.Pais;

import EjercicioTres.Calculo.CalculoFiscal;

public class Ciudad {
    private CalculoFiscal calculoFiscal;
    private int habitantes;
    private long id;
    private String nombre;

    public Ciudad() {
    }

    public Ciudad(int habitantes, long id, String nombre) {
        this.habitantes = habitantes;
        this.id = id;
        this.nombre = nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CalculoFiscal getCalculoFiscal() {
        return calculoFiscal;
    }

    public void setCalculoFiscal(CalculoFiscal calculoFiscal) {
        this.calculoFiscal = calculoFiscal;
    }
}
