package EjercicioNueve.Arte;

import java.util.Date;

public class Escultura extends ObjetoArte{
    private double altura;
    private String estilo;
    private Material material;
    private double peso;

    public Escultura() {
    }

    public Escultura(Date añoCreacion, Artista artista, String descripcion, String identiciacion, String paisOrigen, String titulo, double altura, String estilo, Material material, double peso) {
        super(añoCreacion, artista, descripcion, identiciacion, paisOrigen, titulo);
        this.altura = altura;
        this.estilo = estilo;
        this.material = material;
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
