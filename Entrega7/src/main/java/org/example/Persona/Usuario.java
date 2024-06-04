package org.example.Persona;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario() {
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
        if (edad < 18){
            throw new Exception("Error la edad no puede ser menor de 18");
        }else {
            this.edad = edad;
        }
    }
}
