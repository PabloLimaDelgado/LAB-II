package EjercicioNueve.Arte;

import java.util.Date;

public class Pintura extends ObjetoArte{
    private String estilo;
    private String soporte;
    private String tipoPintura;

    public Pintura() {
    }

    public Pintura(Date añoCreacion, Artista artista, String descripcion, String identiciacion, String paisOrigen, String titulo, String estilo, String soporte, String tipoPintura) {
        super(añoCreacion, artista, descripcion, identiciacion, paisOrigen, titulo);
        this.estilo = estilo;
        this.soporte = soporte;
        this.tipoPintura = tipoPintura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    public String getTipoPintura() {
        return tipoPintura;
    }

    public void setTipoPintura(String tipoPintura) {
        this.tipoPintura = tipoPintura;
    }
}
