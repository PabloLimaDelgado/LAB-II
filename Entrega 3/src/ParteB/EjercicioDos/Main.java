package ParteB.EjercicioDos;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*Camion c1 = new Camion(100.2);

        try {
            c1.acelera(122);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/

        Date fechaVtoUno = new Date(2024, 2,1);
        Matricula matriculaUno = new Matricula(1, fechaVtoUno);

        try {
            Chofer cho1 = new Chofer("Pablo Lima", matriculaUno);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
