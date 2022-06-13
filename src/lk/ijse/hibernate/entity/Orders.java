package lk.ijse.hibernate.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders {
    @Id
    private String oId;
    @ManyToOne
    private Customer customer;

    @CreationTimestamp
    private LocalDate date;


    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails = new ArrayList<>();

    public Orders() {
    }

    public Orders(String oId, Customer customer, LocalDate date, List<OrderDetail> orderDetails) {
        this.oId = oId;
        this.customer = customer;
        this.date = date;
        this.orderDetails = orderDetails;
    }

    public Orders(String oId, Customer customer) {
        this.oId = oId;
        this.customer = customer;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
