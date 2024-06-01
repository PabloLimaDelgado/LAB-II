package EjercicioCinco;

import java.util.ArrayList;

public class Restaurante {
    private int estrellas;
    private String nombre;
    ArrayList <Sucursal> sucursales;

    public Restaurante() {
    }

    public Restaurante(int estrellas, String nombre) {
        this.estrellas = estrellas;
        this.nombre = nombre;
        this.sucursales = new ArrayList<>();
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void sucursalesTiene(Sucursal sucursal){
        sucursales.add(sucursal);
    }
}
