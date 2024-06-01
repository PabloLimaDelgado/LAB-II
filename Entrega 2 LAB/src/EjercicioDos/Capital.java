package EjercicioDos;

public class Capital {
    private double poblacion;
    private Ciudad ciudad;
    public Capital() {
    }

    public Capital(double poblacion, String nombreCiudad) {
        this.poblacion = poblacion;
        this.ciudad = new Ciudad(true, nombreCiudad);
    }

    public double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(double poblacion) {
        this.poblacion = poblacion;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
