package org.example.entities.persons;

import org.example.entities.enums.Role;
import org.example.entities.places.Branch;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Employee extends Person{
    @ManyToOne
    @JoinColumn(name = "id_sucursal")
    private Branch branch;

    public Employee() {
    }

    public Employee(String firstName, String lastName, String phone, String email, String dateBirth, Role role) {
        super(firstName, lastName, phone, email, dateBirth, role);
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}
