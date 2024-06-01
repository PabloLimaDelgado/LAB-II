package EjercicioNueve.Coleccion;

import java.util.Date;

public class Exposicion {
    private Date fechaComienzo;
    private String nombre;

    public Exposicion() {
    }

    public Exposicion(Date fechaComienzo, String nombre) {
        this.fechaComienzo = fechaComienzo;
        this.nombre = nombre;
    }

    public void mostrarColeccion(ColeccionObras coleccion){
        System.out.println(coleccion.getNombre());
        coleccion.mostrarObjetosArte();
    }
}
