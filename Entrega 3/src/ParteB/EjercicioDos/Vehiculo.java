package ParteB.EjercicioDos;

public abstract class Vehiculo {
    private double velocidad;
    public Vehiculo() {
    }

    public Vehiculo(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void acelera(double aceleracion) throws NoPuedeAcelerar120{
        if(aceleracion > 120){
            throw new NoPuedeAcelerar120("El: " + this.getClass() + " no puede acelerar mas de 120");
        }
    }

    public void frenar(){
        System.out.println("Frenando");
    }
}
