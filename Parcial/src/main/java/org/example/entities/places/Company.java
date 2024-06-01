package org.example.entities.places;

import org.example.entities.Base;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "companias")
public class Company extends Base {
    @Column(name = "nombre")
    private String name;
    @Column(name = "razon_social")
    private String reasonSocial;
    @Column(name = "cuil")
    private Integer cuil;

    @OneToMany(mappedBy = "company")
    private List<Branch> branches = new ArrayList<>();

    public Company() {
    }

    public Company(String name, String reasonSocial, Integer cuil) {
        this.name = name;
        this.reasonSocial = reasonSocial;
        this.cuil = cuil;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReasonSocial() {
        return reasonSocial;
    }

    public void setReasonSocial(String reasonSocial) {
        this.reasonSocial = reasonSocial;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public void addBranch(Branch branch){
        branches.add(branch);
    }
}
