package org.example.entities.places;

import org.example.entities.Base;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "provincias")
public class Province extends Base {
    @Column(name = "nombre")
    private String name;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Locality> localities;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_pais")
    private Country country;

    public Province() {
    }

    public Province(String name) {
        this.name = name;
        this.localities = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Locality> getLocalities() {
        return localities;
    }

    public void setLocalities(List<Locality> localities) {
        this.localities = localities;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void addLocality(Locality locality){
        localities.add(locality);
    }
}
