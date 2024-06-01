package EjercicioSeis.Parque;

public class Alojamiento {
    private int capacidad;
    private String categoria;
    private String nombre;

    public Alojamiento() {
    }

    public Alojamiento(int capacidad, String categoria, String nombre) {
        this.capacidad = capacidad;
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
