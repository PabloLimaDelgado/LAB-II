package EjercicioOcho.Persona;

public abstract class Persona {
    private int direccion;
    private String nombre;
    private String seguridadSocial;
    private int telefono;

    public Persona() {
    }

    public Persona(int direccion, String nombre, String seguridadSocial, int telefono) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.seguridadSocial = seguridadSocial;
        this.telefono = telefono;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeguridadSocial() {
        return seguridadSocial;
    }

    public void setSeguridadSocial(String seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
