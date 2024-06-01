package EjercicioNueve.Coleccion;

import EjercicioNueve.Arte.ObjetoArte;

import java.util.ArrayList;

public class ColeccionObras {
    private String descripcion;
    private String direccion;
    private TipoMuseo dondeEsta;
    private String nombre;
    ArrayList <ObjetoArte> objetosArtes = new ArrayList<>();
    private String personaContacto;
    private int telefono;

    public ColeccionObras() {
    }

    public ColeccionObras(String descripcion, String direccion, TipoMuseo dondeEsta, String nombre, ArrayList<ObjetoArte> objetosArtes, String personaContacto, int telefono) {
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.dondeEsta = dondeEsta;
        this.nombre = nombre;
        this.objetosArtes = objetosArtes;
        this.personaContacto = personaContacto;
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoMuseo getDondeEsta() {
        return dondeEsta;
    }

    public void setDondeEsta(TipoMuseo dondeEsta) {
        this.dondeEsta = dondeEsta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<ObjetoArte> getObjetosArtes() {
        return objetosArtes;
    }

    public void setObjetosArtes(ArrayList<ObjetoArte> objetosArtes) {
        this.objetosArtes = objetosArtes;
    }

    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void mostrarObjetosArte(){
        for(ObjetoArte objetoArteUno : objetosArtes){
            System.out.println(objetoArteUno.getTitulo());
        }
    }
}
