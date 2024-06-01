package EjercicioSiete.Codigo;
import EjercicioSiete.Persona.Esquiador;
import EjercicioSiete.Prueba.PruebaIndividual;

public class CodigoEsquiador {
    private int dorsal;
    private Esquiador esquiador;
    private String nombrePrueba;
    private PruebaIndividual prueba;

    public CodigoEsquiador() {
    }

    public CodigoEsquiador(int dorsal, Esquiador esquiador, String nombrePrueba, PruebaIndividual prueba) {
        this.dorsal = dorsal;
        this.esquiador = esquiador;
        this.nombrePrueba = nombrePrueba;
        this.prueba = prueba;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Esquiador getEsquiador() {
        return esquiador;
    }

    public void setEsquiador(Esquiador esquiador) {
        this.esquiador = esquiador;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    public PruebaIndividual getPrueba() {
        return prueba;
    }

    public void setPrueba(PruebaIndividual prueba) {
        this.prueba = prueba;
    }
}
