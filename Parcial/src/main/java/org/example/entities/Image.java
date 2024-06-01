package org.example.entities;

import org.example.entities.Base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "imagenes")
public class Image extends Base {

    @Column(name = "denominacion")
    private String denomination;

    public Image() {
    }

    public Image(String denomination) {
        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }
}
