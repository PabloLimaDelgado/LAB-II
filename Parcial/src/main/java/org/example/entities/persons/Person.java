package org.example.entities.persons;

import org.example.entities.Base;
import org.example.entities.Image;
import org.example.entities.enums.Role;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class Person extends Base implements Serializable {
    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;
    protected String dateBirth;

    @Enumerated(EnumType.STRING)
    protected Role role;

    @OneToOne(cascade = CascadeType.MERGE)
    protected Image imagePerson;

    //@OneToOne(mappedBy = "person")
    //protected User user;

    @OneToOne(cascade = CascadeType.MERGE)
    protected User user;

    public Person() {
    }

    public Person(String firstName, String lastName, String phone, String email, String dateBirth, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.dateBirth = dateBirth;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Image getImagePerson() {
        return imagePerson;
    }

    public void setImagePerson(Image imagePerson) {
        this.imagePerson = imagePerson;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
