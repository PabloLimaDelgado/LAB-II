package org.example.entities.articles;

import org.example.entities.Base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "unidades_medida")
public class MeasuringUnit extends Base {
    @Column(name = "denominacion")
    private String denomination;

    public MeasuringUnit() {
    }

    public MeasuringUnit(String denomination) {
        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }
}
