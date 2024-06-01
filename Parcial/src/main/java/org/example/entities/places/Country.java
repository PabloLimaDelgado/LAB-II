package org.example.entities.places;

import org.example.entities.Base;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "paises")
public class Country extends Base {
    @Column(name = "nombre")
    private String name;

    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Province> provinces;

    public Country() {
    }

    public Country(String name) {
        this.name = name;
        this.provinces = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
    }

    public void addProvince(Province province){
        provinces.add(province);
    }
}
