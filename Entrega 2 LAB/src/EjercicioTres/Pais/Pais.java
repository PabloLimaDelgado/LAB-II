package EjercicioTres.Pais;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList <Provincia> provincias;

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public void provinciasTiene(Provincia provincia){
        provincias.add(provincia);
    }
}
