package EjercicioSiete.Federacion;

import java.util.ArrayList;

public class Estacion {
    private String codigo;
    private int direccion;
    private double kmEsquiable;
    private String nombre;
    private ArrayList<Pista> pistas = new ArrayList<>();
    private String personasDeContacto;
    private int telefono;

    public Estacion() {
    }

    public Estacion(String codigo, int direccion, double kmEsquiable, String nombre, String personasDeContacto, int telefono) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.kmEsquiable = kmEsquiable;
        this.nombre = nombre;
        this.personasDeContacto = personasDeContacto;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public double getKmEsquiable() {
        return kmEsquiable;
    }

    public void setKmEsquiable(double kmEsquiable) {
        this.kmEsquiable = kmEsquiable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonasDeContacto() {
        return personasDeContacto;
    }

    public void setPersonasDeContacto(String personasDeContacto) {
        this.personasDeContacto = personasDeContacto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void agregarPistas(Pista pista){
        pistas.add(pista);
    }

    public void mostrarPistas(){
        for(Pista pista:pistas){
            System.out.println(pista.getDificultad());
        }
    }
}
