package EjercicioSeis.Especie;

public class EspecieAnimal extends Especie{
    private AlimentacionAnimal tipoAlimentacion;

    public EspecieAnimal() {
    }
    public EspecieAnimal(String nombreCientifico, String nombreVulgar, AlimentacionAnimal tipoAlimentacion) {
        super(nombreCientifico, nombreVulgar);
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public AlimentacionAnimal getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(AlimentacionAnimal tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }
}
