package EjercicioTres.Pais;

import java.util.ArrayList;

public class Provincia {
    private boolean deficitEstado;
    private long id;
    private String nombre;
    ArrayList <Ciudad> ciudades;

    public Provincia() {
    }

    public Provincia(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void ciudadesTiene(Ciudad ciudad){
        ciudades.add(ciudad);
    }

    public boolean isDeficitEstado() {
        return deficitEstado;
    }

    public void setDeficitEstado(boolean deficitEstado) {
        this.deficitEstado = deficitEstado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public void definirEstado(){
        int deficitNo = 0;
        for (Ciudad ciudad : ciudades) {
            if(ciudad.getCalculoFiscal().calcularDeficit() >= 0){
                deficitNo++;
            }
        }

        if(deficitNo <= (ciudades.size()/2)){
            this.deficitEstado = true;
        }else{
            this.deficitEstado = false;
        }
    }
}
