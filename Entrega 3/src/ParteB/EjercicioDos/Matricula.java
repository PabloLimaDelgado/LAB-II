package ParteB.EjercicioDos;

import java.util.Date;

public class Matricula {
    private int numero;
    private Date fechaVto;

    public Matricula() {
    }

    public Matricula(int numero, Date fechaVto) {
        this.numero = numero;
        this.fechaVto = fechaVto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaVto() {
        return fechaVto;
    }

    public void setFechaVto(Date fechaVto) {
        this.fechaVto = fechaVto;
    }
}
