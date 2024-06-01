package EjercicioDos;

public class Ciudad {
    private boolean capitalProvincia;
    private String nombreCiudad;

    public Ciudad() {
    }
    public Ciudad(boolean capitalProvincia, String nombreCiudad) {
        this.capitalProvincia = capitalProvincia;
        this.nombreCiudad = nombreCiudad;
    }

    public boolean isCapitalProvincia() {
        return capitalProvincia;
    }

    public void setCapitalProvincia(boolean capitalProvincia) {
        this.capitalProvincia = capitalProvincia;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }
}
