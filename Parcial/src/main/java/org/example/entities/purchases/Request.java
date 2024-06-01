package org.example.entities.purchases;

import org.example.entities.Base;
import org.example.entities.enums.PaymentForm;
import org.example.entities.enums.ShipmentType;
import org.example.entities.enums.State;
import org.example.entities.persons.Client;
import org.example.entities.places.Adress;
import org.example.entities.places.Branch;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Request extends Base {
    @Column(name = "hora_estimada_finalizacion")
    private LocalTime EstimatedEndTime;

    @Column(name = "total_costo")
    private Double totalCost;

    @Column(name = "estado")
    @Enumerated(EnumType.STRING)
    private State state;

    @Column(name = "tipo_envio")
    @Enumerated(EnumType.STRING)
    private ShipmentType shipmentType;

    @Column(name = "forma_pago")
    @Enumerated(EnumType.STRING)
    private PaymentForm paymentForm;

    @Column(name = "fecha_pedido")
    private LocalDate dateOrder;

    @ManyToOne(optional = true)
    @JoinColumn(name = "cliente_id")
    private Client client;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_domicilio")
    private Adress adress;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "id_branch")
    private Branch branch;

    @OneToMany(mappedBy = "request", cascade = CascadeType.MERGE, orphanRemoval = true)
    private List<DetailRequest> detailsRequest = new ArrayList<>();

    public Request() {
    }

    public Request(LocalTime estimatedEndTime, Double totalCost, State state, ShipmentType shipmentType, PaymentForm paymentForm, LocalDate dateOrder) {
        EstimatedEndTime = estimatedEndTime;
        this.totalCost = totalCost;
        this.state = state;
        this.shipmentType = shipmentType;
        this.paymentForm = paymentForm;
        this.dateOrder = dateOrder;
    }

    public LocalTime getEstimatedEndTime() {
        return EstimatedEndTime;
    }

    public void setEstimatedEndTime(LocalTime estimatedEndTime) {
        EstimatedEndTime = estimatedEndTime;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
    }

    public PaymentForm getPaymentForm() {
        return paymentForm;
    }

    public void setPaymentForm(PaymentForm paymentForm) {
        this.paymentForm = paymentForm;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public List<DetailRequest> getDetailsRequest() {
        return detailsRequest;
    }

    public void setDetailsRequest(List<DetailRequest> detailsRequest) {
        this.detailsRequest = detailsRequest;
    }

    public void addDetailRequest(DetailRequest detailRequest){
        detailsRequest.add(detailRequest);
    }
}
