package EjercicioNueve.Arte;

import java.util.Date;

public class Otros extends ObjetoArte{
    public Otros() {
    }

    public Otros(Date añoCreacion, Artista artista, String descripcion, String identiciacion, String paisOrigen, String titulo) {
        super(añoCreacion, artista, descripcion, identiciacion, paisOrigen, titulo);
    }
}
