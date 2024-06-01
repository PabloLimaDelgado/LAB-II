package org.example.entities.places;

import org.example.entities.Base;
import org.example.entities.purchases.Request;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "domicilios")
public class Adress extends Base {
    @Column(name = "calle")
    private String street;
    @Column(name = "numero")
    private Integer number;
    @Column(name = "codigo_postal")
    private Integer cp;

    @OneToMany(mappedBy = "adress", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Request> requests = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_localidades")
    private Locality locality;

    public Adress() {
    }

    public Adress(String street, Integer number, Integer cp) {
        this.street = street;
        this.number = number;
        this.cp = cp;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public Locality getLocality() {
        return locality;
    }

    public void setLocality(Locality locality) {
        this.locality = locality;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public void addRequest(Request request){
        requests.add(request);
    }

}
