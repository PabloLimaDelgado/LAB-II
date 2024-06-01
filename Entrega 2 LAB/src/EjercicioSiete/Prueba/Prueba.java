package EjercicioSiete.Prueba;

import EjercicioSiete.Federacion.Pista;

import java.util.ArrayList;

public abstract class Prueba {
    private String nombrePrueba;
    private  int idPrueba;
    private TipoPrueba tipoPrueba;
    private ArrayList<Pista> pistas = new ArrayList<>();
    public Prueba() {
    }

    public Prueba(String nombrePrueba, int idPrueba, TipoPrueba tipoPrueba) {
        this.nombrePrueba = nombrePrueba;
        this.idPrueba = idPrueba;
        this.tipoPrueba = tipoPrueba;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    public int getIdPrueba() {
        return idPrueba;
    }

    public void setIdPrueba(int idPrueba) {
        this.idPrueba = idPrueba;
    }

    public TipoPrueba getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(TipoPrueba tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    public void pistasControladas(Pista  pista){
        pistas.add(pista);
    }

    public void mostrarPistas(){
        for (Pista pista:pistas){
            System.out.println(pista.getDificultad());
        }
    }
}
