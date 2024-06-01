package org.example.entities.places;

import org.example.entities.Base;
import org.example.entities.persons.Employee;
import org.example.entities.promotions.Promotion;
import org.example.entities.purchases.Category;
import org.example.entities.purchases.Request;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "sucursales")
public class Branch extends Base {
    @Column(name = "nombre")
    private String name;
    @Column(name = "hora_apertura")
    private LocalTime openingHours;
    @Column(name = "hora_cierre")
    private LocalTime hoursClosing;
    @Column(name = "casa_matriz")
    private boolean headOffice;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Employee> employees = new ArrayList<>();

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_Adress")
    private Adress adress;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Company company;

    @ManyToMany(mappedBy = "branches")
    private Set<Category> categories = new HashSet<Category>();

    @OneToMany(mappedBy = "branch", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<Request> requests = new ArrayList<>();

    @ManyToMany
    private Set<Promotion> promotions = new HashSet<>();

    public Branch() {
    }

    public Branch(String name, LocalTime openingHours, LocalTime hoursClosing, boolean headOffice) {
        this.name = name;
        this.openingHours = openingHours;
        this.hoursClosing = hoursClosing;
        this.headOffice = headOffice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(LocalTime openingHours) {
        this.openingHours = openingHours;
    }

    public LocalTime getHoursClosing() {
        return hoursClosing;
    }

    public void setHoursClosing(LocalTime hoursClosing) {
        this.hoursClosing = hoursClosing;
    }

    public boolean isHeadOffice() {
        return headOffice;
    }

    public void setHeadOffice(boolean headOffice) {
        this.headOffice = headOffice;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void addRequest(Request request){
        requests.add(request);
    }

    public void addCategory(Category category){
        categories.add(category);
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

    public List<Request> getRequests() {
        return requests;
    }

    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    public Set<Promotion> getPromotions() {
        return promotions;
    }

    public void setPromotions(Set<Promotion> promotions) {
        this.promotions = promotions;
    }

    public void addPromotion(Promotion promotion){
        promotions.add(promotion);
    }
}
