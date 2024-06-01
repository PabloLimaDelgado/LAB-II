package EjercicioSiete.Prueba;

import java.util.Date;

public class PruebaIndividual extends Prueba {
    private int duracionHoras;
    private Date fecha;
    private String vencedor;

    public PruebaIndividual() {
    }

    public PruebaIndividual(String nombrePrueba, int idPrueba, TipoPrueba tipoPrueba, int duracionHoras, Date fecha, String vencedor) {
        super(nombrePrueba, idPrueba, tipoPrueba);
        this.duracionHoras = duracionHoras;
        this.fecha = fecha;
        this.vencedor = vencedor;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }
}
