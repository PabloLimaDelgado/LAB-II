package EjercicioNueve.EstadoArte;

import java.util.Date;

public class Prestamo {
    private Date fechaDevolucion;
    private Date fechaRecibida;
    private String nombreColeccion;

    public Prestamo() {
    }

    public Prestamo(Date fechaDevolucion, Date fechaRecibida, String nombreColeccion) {
        this.fechaDevolucion = fechaDevolucion;
        this.fechaRecibida = fechaRecibida;
        this.nombreColeccion = nombreColeccion;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Date getFechaRecibida() {
        return fechaRecibida;
    }

    public void setFechaRecibida(Date fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
}
