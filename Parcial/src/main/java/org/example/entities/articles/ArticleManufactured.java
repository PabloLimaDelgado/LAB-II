package org.example.entities.articles;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "articulos_manufacturados")
public class ArticleManufactured extends Article {
    @Column(name = "descripcion")
    private String description;

    @Column(name = "tiempo_estimado_minutos")
    private Integer timeEstimatedMinutes;

    @Column(name = "preparacion")
    private String preparation;

    @OneToMany(mappedBy = "articleManufactured", cascade = CascadeType.MERGE, orphanRemoval = true)
    private Set<ArticleManufacturedDetail> articleManufacturedDetails = new HashSet<>();

    public ArticleManufactured() {
    }

    public ArticleManufactured(String denomination, Double priceSale, String description, Integer timeEstimatedMinutes, String preparation) {
        super(denomination, priceSale);
        this.description = description;
        this.timeEstimatedMinutes = timeEstimatedMinutes;
        this.preparation = preparation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTimeEstimatedMinutes() {
        return timeEstimatedMinutes;
    }

    public void setTimeEstimatedMinutes(Integer timeEstimatedMinutes) {
        this.timeEstimatedMinutes = timeEstimatedMinutes;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public void addArticleManufacturedDetail(ArticleManufacturedDetail articleManufacturedDetail){
        articleManufacturedDetails.add(articleManufacturedDetail);
    }
}
