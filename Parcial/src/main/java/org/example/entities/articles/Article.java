package org.example.entities.articles;

import org.example.entities.Base;
import org.example.entities.purchases.Category;
import org.example.entities.promotions.DetailPromotion;
import org.example.entities.Image;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Article extends Base {

    @Column(name = "denominacion")
    protected String denomination;

    @Column(name = "precio_venta")
    protected Double priceSale;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "unidad_medida")
    private MeasuringUnit measuringUnit;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany
    private Set<Image> imagesArticle = new HashSet<>();

    @OneToMany(mappedBy = "article", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<DetailPromotion> detailPromotions = new ArrayList<DetailPromotion>();

    public Article() {
    }

    public Article(String denomination, Double priceSale) {
        this.denomination = denomination;
        this.priceSale = priceSale;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public Double getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(Double priceSale) {
        this.priceSale = priceSale;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Image> getImagesArticle() {
        return imagesArticle;
    }

    public void setImagesArticle(Set<Image> imagesArticle) {
        this.imagesArticle = imagesArticle;
    }

    public MeasuringUnit getMeasuringUnit() {
        return measuringUnit;
    }

    public void setMeasuringUnit(MeasuringUnit measuringUnit) {
        this.measuringUnit = measuringUnit;
    }

    public List<DetailPromotion> getDetailPromotions() {
        return detailPromotions;
    }

    public void setDetailPromotions(List<DetailPromotion> detailPromotions) {
        this.detailPromotions = detailPromotions;
    }

    public void addImage(Image image){
        imagesArticle.add(image);
    }

    public void addDetailPromotion(DetailPromotion detailPromotion){
        detailPromotions.add(detailPromotion);
    }
}
