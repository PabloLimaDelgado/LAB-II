package ParteB;

//Cree un programa que lance una ArithmeticException.
public class EjercicioUno {
    public static void main(String[] args) {
        try {
            double num = 10/0;
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }
    }
}
