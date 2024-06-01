package ParteB.EjersicioTres;

public class EjersicioTres {
    public static void main(String[] args) throws ParImpar{
        int num = (int) (Math.random() * 100);

        System.out.println("El número es: " + num);

        if(num % 2 == 0){
            throw new ParImpar("El número es par");
        }else {
            throw new ParImpar("El número es impar");
        }
    }
}
