package org.example.entities.articles;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "articulos_insumo")
public class InputArticle extends Article {
    @Column(name = "precio_compra")
    private Double purchasePrice;

    @Column(name = "stock_actual")
    private Integer actualStock;

    @Column(name = "stock_maximo")
    private Integer maxStock;

    @Column(name = "es_para_elaborar")
    private Boolean isToElaborate;

    public InputArticle() {
    }

    public InputArticle(String denomination, Double priceSale, Double purchasePrice, Integer actualStock, Integer maxStock, Boolean isToElaborate) {
        super(denomination, priceSale);
        this.purchasePrice = purchasePrice;
        this.actualStock = actualStock;
        this.maxStock = maxStock;
        this.isToElaborate = isToElaborate;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getActualStock() {
        return actualStock;
    }

    public void setActualStock(Integer actualStock) {
        this.actualStock = actualStock;
    }

    public Integer getMaxStock() {
        return maxStock;
    }

    public void setMaxStock(Integer maxStock) {
        this.maxStock = maxStock;
    }

    public Boolean getToElaborate() {
        return isToElaborate;
    }

    public void setToElaborate(Boolean toElaborate) {
        isToElaborate = toElaborate;
    }
}
