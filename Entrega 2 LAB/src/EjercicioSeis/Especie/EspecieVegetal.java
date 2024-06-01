package EjercicioSeis.Especie;

public class EspecieVegetal extends Especie{
    private String epocaFloracion;

    public EspecieVegetal() {
    }

    public EspecieVegetal(String nombreCientifico, String nombreVulgar, String epocaFloracion) {
        super(nombreCientifico, nombreVulgar);
        this.epocaFloracion = epocaFloracion;
    }
}
