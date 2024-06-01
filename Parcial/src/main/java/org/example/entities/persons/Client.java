package org.example.entities.persons;

import org.example.entities.enums.Role;
import org.example.entities.purchases.Request;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "clientes")
public class Client extends Person{
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Request> requests = new HashSet<>();

    public Client() {
    }

    public Client(String firstName, String lastName, String phone, String email, String dateBirth, Role role) {
        super(firstName, lastName, phone, email, dateBirth, role);
    }

    public Set<Request> getRequests() {
        return requests;
    }

    public void setRequests(Set<Request> requests) {
        this.requests = requests;
    }

    public void addRequest(Request request){
        requests.add(request);
    }
}
