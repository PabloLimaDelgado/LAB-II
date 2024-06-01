package EjercicioDos;

import java.util.ArrayList;

public class Pais {
    private Capital capital;
    private String nombre;
    private ArrayList <Pais> paisesLimitrofes = new ArrayList<>();
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

    public ArrayList<Pais> getPaisesLimitrofes() {
        return paisesLimitrofes;
    }

    public void setPaisesLimitrofes(ArrayList<Pais> paisesLimitrofes) {
        this.paisesLimitrofes = paisesLimitrofes;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

    public void paisLimita(Pais pais){
        paisesLimitrofes.add(pais);
    }

    public void esCapital(Capital capital){
        this.capital = capital;
    }

    public Capital getCapital() {
        return capital;
    }

    public void tieneProvincia(Provincia provincia){
        provincias.add(provincia);
    }
}
