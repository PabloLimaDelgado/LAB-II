package ParteB.EjercicioDos;

import java.time.Instant;
import java.util.Date;

public class Chofer {
    private String nombre;
    private Matricula matricula;
    public static Date fechaVencimientoMatricula = new Date(2024,1,10);

    public Chofer() {
    }

    public Chofer(String nombre, Matricula matricula) throws matriculaVencidaException {
        this.nombre = nombre;

        Instant instant1 = fechaVencimientoMatricula.toInstant();
        Instant instant2 = matricula.getFechaVto().toInstant();
        int comparacion = instant1.compareTo(instant2);

        //Instant 1 es posterior a instant 2 eso quiere decir que tiene la matricula vencida
        if (comparacion < 0){
            throw new matriculaVencidaException();
        }else{
            this.matricula = matricula;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }
}
