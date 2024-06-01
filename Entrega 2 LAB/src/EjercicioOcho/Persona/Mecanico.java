package EjercicioOcho.Persona;

import EjercicioOcho.Aeropuerto.TipoAvion;

import java.util.ArrayList;
import java.util.Date;

public class Mecanico extends Persona{
    private int salario;
    private Date turno;
    ArrayList <TipoAvion> capacitado = new ArrayList<>();
    public Mecanico() {
    }
    public Mecanico(int direccion, String nombre, String seguridadSocial, int telefono, int salario, Date turno) {
        super(direccion, nombre, seguridadSocial, telefono);
        this.salario = salario;
        this.turno = turno;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public Date getTurno() {
        return turno;
    }

    public void setTurno(Date turno) {
        this.turno = turno;
    }

    public void capacitarMecanico(TipoAvion avion){
        capacitado.add(avion);
    }

    public void mostrarCapacitaciones(){
        for (TipoAvion avion : capacitado){
            System.out.println(avion);
        }
    }
}
