package lk.ijse.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
public class OrderDetail implements Serializable {
    @ManyToOne
    @Id
    private Orders order;

    @ManyToOne@Id
    private Item item;


    private int qty;

    public OrderDetail() {
    }

    public OrderDetail(Orders order, Item item, int qty) {
        this.order = order;
        this.item = item;
        this.qty = qty;
    }


    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
