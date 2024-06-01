package EjercicioSiete.Federacion;

import java.util.ArrayList;

public class Federacion {
    private String nombreFederacion;
    private ArrayList<Estacion> estaciones = new ArrayList<>();
    public Federacion() {
    }

    public Federacion(String nombreFederacion) {
        this.nombreFederacion = nombreFederacion;
    }

    public String getNombreFederacion() {
        return nombreFederacion;
    }

    public void setNombreFederacion(String nombreFederacion) {
        this.nombreFederacion = nombreFederacion;
    }

    public void estacionesControladas(Estacion estacion){
        estaciones.add(estacion);
    }

    public void mostrarEstaciones(){
        for(Estacion estacion:estaciones){
            System.out.println(estacion.getNombre());
        }
    }
}
