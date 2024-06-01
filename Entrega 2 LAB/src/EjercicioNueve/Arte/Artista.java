package EjercicioNueve.Arte;

import java.util.Date;

public class Artista {
    private String descripcion;
    private Epoca epoca;
    private Cultura estilo;
    private Date fechaDeDefuncion;
    private Date fechaNacimiento;
    private String nombre;
    private String paisOrigen;

    public Artista() {
    }

    public Artista(String descripcion, Epoca epoca, Cultura estilo, Date fechaNacimiento, String nombre, String paisOrigen) {
        this.descripcion = descripcion;
        this.epoca = epoca;
        this.estilo = estilo;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
    }

    public Artista(String descripcion, Epoca epoca, Cultura estilo, Date fechaDeDefuncion, Date fechaNacimiento, String nombre, String paisOrigen) {
        this.descripcion = descripcion;
        this.epoca = epoca;
        this.estilo = estilo;
        this.fechaDeDefuncion = fechaDeDefuncion;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Epoca getEpoca() {
        return epoca;
    }

    public void setEpoca(Epoca epoca) {
        this.epoca = epoca;
    }

    public Cultura getEstilo() {
        return estilo;
    }

    public void setEstilo(Cultura estilo) {
        this.estilo = estilo;
    }

    public Date getFechaDeDefuncion() {
        return fechaDeDefuncion;
    }

    public void setFechaDeDefuncion(Date fechaDeDefuncion) {
        this.fechaDeDefuncion = fechaDeDefuncion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}
