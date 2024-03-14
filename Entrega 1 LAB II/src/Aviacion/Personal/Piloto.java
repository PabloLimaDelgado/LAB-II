package Aviacion.Personal;

public class Piloto extends Persona implements Volador{
    private int salario;
    private String empresa;

    public Piloto() {
    }

    public Piloto(int edad, int dni, String nombre, int salario, String empresa) {
        super(edad, dni, nombre);
        this.salario = salario;
        this.empresa = empresa;
    }

    @Override
    public void formaVolar(String forma){
        System.out.println("La forma es: " + forma);
    }
}
