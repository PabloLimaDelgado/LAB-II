package org.example.entities.purchases;

import org.example.entities.Base;
import org.example.entities.places.Branch;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categorias")
public class Category extends Base {
    @Column(name = "denominacion")
    private String denomination;

    @OneToMany(mappedBy = "categoryDad")
    private Set<Category> subcategories = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "categoria_padre_id")
    private Category categoryDad;

    @ManyToMany
    @JoinTable(
            name = "category_branch",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "branch_id")
    )
    private Set<Branch> branches = new HashSet<Branch>();

    public Category() {
    }

    public Category(String denomination) {
        this.denomination = denomination;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public Set<Category> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(Set<Category> subcategories) {
        this.subcategories = subcategories;
    }

    public Category getCategoryDad() {
        return categoryDad;
    }

    public void setCategoryDad(Category categoryDad) {
        this.categoryDad = categoryDad;
    }

    public Set<Branch> getBranches() {
        return branches;
    }

    public void setBranches(Set<Branch> branches) {
        this.branches = branches;
    }

    public void addCategory(Category category){
        subcategories.add(category);
    }

    public void addBranches(Branch branch){
        branches.add(branch);
        branch.addCategory(this);
    }
}
