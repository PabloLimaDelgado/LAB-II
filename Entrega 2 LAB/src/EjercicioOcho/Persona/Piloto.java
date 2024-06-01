package EjercicioOcho.Persona;

import EjercicioOcho.Aeropuerto.TipoAvion;

import java.util.ArrayList;

public class Piloto extends Persona{
    private int licencia;
    ArrayList<TipoAvion> capacitado = new ArrayList<>();

    public Piloto() {
    }

    public Piloto(int direccion, String nombre, String seguridadSocial, int telefono, int licencia) {
        super(direccion, nombre, seguridadSocial, telefono);
        this.licencia = licencia;
    }

    public int getLicencia() {
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public void capacitarPiloto(TipoAvion avion){
        capacitado.add(avion);
    }

    public void mostrarCapacitaciones(){
        for (TipoAvion avion : capacitado){
            System.out.println(avion);
        }
    }
}
