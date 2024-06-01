package EjercicioSiete.Persona;

import java.util.Date;

public abstract class Persona {
    private int DNI;
    private int edad;
    private Date nacimiento;
    private String nombre;

    public Persona() {
    }

    public Persona(int DNI, int edad, Date nacimiento, String nombre) {
        this.DNI = DNI;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
