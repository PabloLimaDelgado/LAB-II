package EjercicioSeis.Parque;

import EjercicioSeis.Especie.Especie;
import EjercicioSeis.Persona.Trabajador;

import java.util.ArrayList;

public class Area {
    private ArrayList<Especie> especies;
    private ArrayList<Trabajador> guardiasAsignados = new ArrayList<>();
    private double kmCuadrados;
    private String nombre;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Area() {
    }

    public Area(double kmCuadrados, String nombre) {
        this.kmCuadrados = kmCuadrados;
        this.nombre = nombre;
        this.especies = new ArrayList<>();
    }

    public ArrayList<Especie> getEspecies() {
        return especies;
    }

    public void setEspecies(ArrayList<Especie> especies) {
        this.especies = especies;
    }

    public double getKmCuadrados() {
        return kmCuadrados;
    }

    public void setKmCuadrados(double kmCuadrados) {
        this.kmCuadrados = kmCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void agregarVehiculos(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
}
