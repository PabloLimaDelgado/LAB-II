package EjercicioDos;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList <Pais> paisesLimitrofes = new ArrayList<>();
    private ArrayList <Provincia> provinciasLimitrofes = new ArrayList<>();
    private ArrayList <Ciudad> ciudades;

    public Provincia() {
    }
    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }

    public void setPaisesLimitrofes(ArrayList<Pais> paisesLimitrofes) {
        this.paisesLimitrofes = paisesLimitrofes;
    }

    public ArrayList<Provincia> getProvinciasLimitrofes() {
        return provinciasLimitrofes;
    }

    public void setProvinciasLimitrofes(ArrayList<Provincia> provinciasLimitrofes) {
        this.provinciasLimitrofes = provinciasLimitrofes;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void paisLimita(Pais pais){
        paisesLimitrofes.add(pais);
    }

    public void provinciaLimita(Provincia provincia){
        provinciasLimitrofes.add(provincia);
    }

    public void ciudadesTiene(Ciudad ciudad){
        ciudades.add(ciudad);
    }
}
