package EjercicioCinco;

import java.util.ArrayList;

public class Ciudad {
    private String nombre;
    private ArrayList <Restaurante> restaurantes = new ArrayList<>();

    public Ciudad() {
    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public void agregarRestaurante(Restaurante restaurante){
        restaurantes.add(restaurante);
    }
}
