package EjercicioDos;

import java.util.ArrayList;

public class Continente {
    private String nombre;
    ArrayList <Pais> paises;

    public Continente() {
    }

    public Continente(String nombre) {
        this.nombre = nombre;
        this.paises = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pais> getPaises() {
        return paises;
    }

    public void setPaises(ArrayList<Pais> paises) {
        this.paises = paises;
    }

    public void tienePais(Pais pais){
        paises.add(pais);
    }
}
