package org.example.entities.persons;

import org.example.entities.Base;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class User extends Base {

    @Column(name = "auth_id")
    private String auth0id;

    @Column(name = "user_name")
    private String userName;

    //@OneToOne(cascade = CascadeType.PERSIST)
    //@JoinColumn(name = "person_id")
    //private Person person;

    public User() {
    }

    public User(String auth0id, String userName) {
        this.auth0id = auth0id;
        this.userName = userName;
    }

    public String getAuth0id() {
        return auth0id;
    }

    public void setAuth0id(String auth0id) {
        this.auth0id = auth0id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
