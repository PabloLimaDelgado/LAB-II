package org.example.entities.articles;

import org.example.entities.Base;

import javax.persistence.*;

@Entity
@Table(name = "articulos_manufacturados_detalles")
public class ArticleManufacturedDetail extends Base {
    @Column(name = "cantidad")
    private Integer quantity;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private InputArticle inputArticle;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private ArticleManufactured articleManufactured;

    public ArticleManufacturedDetail() {
    }

    public ArticleManufacturedDetail(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public InputArticle getInputArticle() {
        return inputArticle;
    }

    public void setInputArticle(InputArticle inputArticle) {
        this.inputArticle = inputArticle;
    }

    public ArticleManufactured getArticleManufactured() {
        return articleManufactured;
    }

    public void setArticleManufactured(ArticleManufactured articleManufactured) {
        this.articleManufactured = articleManufactured;
    }
}
