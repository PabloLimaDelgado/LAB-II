package EjercicioCinco;

import java.util.ArrayList;

public class Persona {
    private int dni;
    private String nombre;
    ArrayList <PlatoComida> platosGustoso = new ArrayList<>();
    ArrayList <Sucursal> sucursalesVisita = new ArrayList<>();

    public Persona() {
    }

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<PlatoComida> getPlatoGustoso() {
        return platosGustoso;
    }

    public void setPlatoGustoso(ArrayList<PlatoComida> platoGustoso) {
        this.platosGustoso = platoGustoso;
    }

    public ArrayList<Sucursal> getSucursalesVisita() {
        return sucursalesVisita;
    }

    public void setSucursalesVisita(ArrayList<Sucursal> sucursalesVisita) {
        this.sucursalesVisita = sucursalesVisita;
    }

    public void comioPlato(PlatoComida platoComida){
        platosGustoso.add(platoComida);
    }

    public void sucursalesVisitadas(Sucursal sucursal){
        sucursalesVisita.add(sucursal);
    }
}
