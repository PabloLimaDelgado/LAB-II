package Aviacion.Personal;

public abstract class Persona {
    protected int edad;
    protected int dni;
    protected String nombre;

    public Persona() {
    }

    public Persona(int edad, int dni, String nombre) {
        this.edad = edad;
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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
}
