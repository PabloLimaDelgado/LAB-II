package ParteB;

public class EjersicioCuatro {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void metodo1() throws Exception {
        metodo2();
    }

    public static void metodo2() throws Exception {
        metodo3();
    }

    public static void metodo3() throws Exception {
        metodo4();
    }

    public static void metodo4() throws Exception {
        throw new Exception("Excepcion en metodo 4");
    }
}
