package org.example.entities.purchases;

import org.example.entities.Base;
import org.example.entities.purchases.Request;

import javax.persistence.*;

@Entity
@Table(name = "detalles_pedido")
public class DetailRequest extends Base {
    @Column(name = "cantidad")
    private Integer quantity;

    @Column(name = "subtotal")
    private Double subtotal;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Request request;


    public DetailRequest() {
    }

    public DetailRequest(Integer quantity, Double subtotal) {
        this.quantity = quantity;
        this.subtotal = subtotal;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

}
