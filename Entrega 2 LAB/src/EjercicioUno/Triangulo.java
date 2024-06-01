package EjercicioUno;

public class Triangulo extends Poligono{
    public Triangulo(int lado, Lado ladoUno, Lado ladoDos, Lado ladoTres) {
        super(lado);

        this.lados[0] = ladoUno;
        this.lados[1] = ladoDos;
        this.lados[2] = ladoTres;
    }


}
