package org.example.entities.promotions;

import org.example.entities.Base;
import org.example.entities.articles.Article;

import javax.persistence.*;

@Entity
@Table(name = "detalles_promocion")
public class DetailPromotion extends Base {
    @Column(name = "cantidad")
    private int quantity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Promotion promotion;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Article article;

    public DetailPromotion() {
    }

    public DetailPromotion(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}
