package org.example.entities.places;

import org.example.entities.Base;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "localidades")
public class Locality extends Base {
    @Column(name = "nombre")
    private String name;

    @OneToMany(mappedBy = "locality", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Adress> adresses;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_provincia")
    private Province province;

    public Locality() {
    }

    public Locality(String name) {
        this.name = name;
        this.adresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adress> adresses) {
        this.adresses = adresses;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public void addAdress(Adress adress){
        adresses.add(adress);
    }
}
