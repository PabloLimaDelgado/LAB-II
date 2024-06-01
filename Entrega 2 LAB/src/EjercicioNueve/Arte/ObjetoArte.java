package EjercicioNueve.Arte;

import EjercicioNueve.EstadoArte.Permanente;
import EjercicioNueve.EstadoArte.Prestamo;

import java.util.Date;

public abstract class ObjetoArte {
    private Date añoCreacion;
    private Artista artista;
    private String descripcion;
    private String identiciacion;
    private String paisOrigen;
    private String titulo;
    private Permanente permanente;
    private Prestamo prestamo;


    public ObjetoArte() {
    }

    public ObjetoArte(Date añoCreacion, Artista artista, String descripcion, String identiciacion, String paisOrigen, String titulo) {
        this.añoCreacion = añoCreacion;
        this.artista = artista;
        this.descripcion = descripcion;
        this.identiciacion = identiciacion;
        this.paisOrigen = paisOrigen;
        this.titulo = titulo;
    }

    public Date getAñoCreacion() {
        return añoCreacion;
    }

    public void setAñoCreacion(Date añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdenticiacion() {
        return identiciacion;
    }

    public void setIdenticiacion(String identiciacion) {
        this.identiciacion = identiciacion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void esPermanente(Permanente permanente){
        this.permanente = permanente;
    }

    public void esPrestamo(Prestamo prestamo){
        this.prestamo = prestamo;
    }
}
