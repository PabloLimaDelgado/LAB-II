package EjercicioUno;

public class Lado {
    private Punto[] puntos = new Punto[2];

    public Lado(int x, int y, int xDos, int yDos) {
        this.puntos[0] = new Punto(x, y);
        this.puntos[1] = new Punto(xDos, yDos);
    }

    public Punto[] getPuntos() {
        return puntos;
    }

    public void setPuntos(Punto[] puntos) {
        this.puntos = puntos;
    }

    public void mostrarPuntos(){
        for (int i = 0; i < 2; i++) {
            System.out.println(this.puntos[i].getX() + " " + this.puntos[i].getY());
        }
    }
}
