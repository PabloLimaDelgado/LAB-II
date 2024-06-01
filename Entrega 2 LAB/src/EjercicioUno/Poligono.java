package EjercicioUno;
import java.util.ArrayList;

public abstract class Poligono {
    protected Lado[] lados;

    public Poligono(int lado) {
        this.lados = new Lado[lado];
    }


    public void mostrarLados(){
        for (int i = 0; i < lados.length; i++) {
            this.lados[i].mostrarPuntos();
        }
    }
}
