package org.example.entities.promotions;

import org.example.entities.Base;
import org.example.entities.Image;
import org.example.entities.enums.PromotionType;
import org.example.entities.places.Branch;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "promociones")
public class Promotion extends Base {
    @Column(name = "denominacion")
    private String denomination;

    @Column(name = "fecha_desde")
    private LocalDate dateFrom;

    @Column(name = "fecha_hasta")
    private LocalDate dateTo;

    @Column(name = "hora_desde")
    private LocalTime timeFrom;

    @Column(name = "hora_hasta")
    private LocalTime timeTo;

    @Column(name = "descripcion_descuento")
    private String descriptionDiscount;

    @Column(name = "precio_promocional")
    private Double promotionalPrice;

    @Enumerated(EnumType.STRING)
    private PromotionType promotionType;

    @OneToMany
    private Set<Image> imagesPromotion = new HashSet<Image>();

    @ManyToMany
    @JoinTable(
            name = "promotion_branch",
            joinColumns = @JoinColumn(name = "promotion_id"),
            inverseJoinColumns = @JoinColumn(name = "branch_id")
    )
    private Set<Branch> branches = new HashSet<>();

    public Promotion() {
    }

    public Promotion(String denomination, LocalDate dateFrom, LocalDate dateTo, LocalTime timeFrom, LocalTime timeTo, String descriptionDiscount, Double promotionalPrice, PromotionType promotionType) {
        this.denomination = denomination;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
        this.descriptionDiscount = descriptionDiscount;
        this.promotionalPrice = promotionalPrice;
        this.promotionType = promotionType;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public LocalTime getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(LocalTime timeFrom) {
        this.timeFrom = timeFrom;
    }

    public LocalTime getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(LocalTime timeTo) {
        this.timeTo = timeTo;
    }

    public String getDescriptionDiscount() {
        return descriptionDiscount;
    }

    public void setDescriptionDiscount(String descriptionDiscount) {
        this.descriptionDiscount = descriptionDiscount;
    }

    public Double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(Double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    public PromotionType getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(PromotionType promotionType) {
        this.promotionType = promotionType;
    }

    public Set<Image> getImagesPromotion() {
        return imagesPromotion;
    }

    public void setImagesPromotion(Set<Image> imagesPromotion) {
        this.imagesPromotion = imagesPromotion;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }

    public void addBranches(Branch branch){
        branches.add(branch);
        branch.addPromotion(this);
    }

    public void addImages(Image image){
        imagesPromotion.add(image);
    }
}
