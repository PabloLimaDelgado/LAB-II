package EjercicioCuatro;

import java.util.ArrayList;
import java.util.Date;

public class Lote {
    private ArrayList <Mineral> minerales = new ArrayList<>();
    private TipoLote tipoLote;
    private int hectareas;
    private Cereal cereal;
    private boolean pasturasPlanto;

    public Lote() {
    }

    public Lote(int hectareas, boolean pasturasPlanto) {
        this.hectareas = hectareas;
        this.pasturasPlanto = pasturasPlanto;
    }

    public ArrayList<Mineral> getMineral() {
        return minerales;
    }

    public void setMineral(ArrayList<Mineral> mineral) {
        this.minerales = mineral;
    }

    public int getHectareas() {
        return hectareas;
    }

    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }

    public boolean isPasturasPlanto() {
        return pasturasPlanto;
    }

    public void setPasturasPlanto(boolean pasturasPlanto) {
        this.pasturasPlanto = pasturasPlanto;
    }

    public void agregarMineral(Mineral mineral){
        minerales.add(mineral);
    }

    public void sembrar(){
        for(Mineral mineral : minerales){
            if(mineral.getNombre().equals("Calcio")){
                this.cereal = Cereal.COSECHA_FINA;
            }else if(mineral.getNombre().equals("Hierro")){
                this.cereal = Cereal.COSECHA_GRUESA;
            }else if(pasturasPlanto == false && mineral.getNombre().equals("Zinc")) {
                this.cereal = Cereal.PASTURAS;
            }else{
                this.cereal = null;
            }
        }
    }

    public Cereal getCereal() {
        return cereal;
    }

    public void setTipoLote(){
        int count = 0;
        for(Mineral mineral : minerales){
            if(mineral.getNombre().equals("Calcio")){
                count++;
            } else if (mineral.getNombre().equals("Zinc")) {
                count++;
            }

            if(count >= 2){
                this.tipoLote = TipoLote.ESPECIAL;
            }else{
                this.tipoLote = TipoLote.COMUN;
            }
        }
    }

    public TipoLote getTipoLote() {
        return tipoLote;
    }
}
