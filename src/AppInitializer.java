import lk.ijse.hibernate.entity.Customer;
import lk.ijse.hibernate.entity.Item;
import lk.ijse.hibernate.entity.OrderDetail;
import lk.ijse.hibernate.entity.Orders;
import lk.ijse.hibernate.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        c1.setId("C001");
        c1.setName("Nimesh");
        c1.setSalary(40000);
        c1.setAddress("Galle");

        Item i1 = new Item();
        i1.setCode("I001");
        i1.setDescription("Butter");
        i1.setUnitPrice(600);
        i1.setQtyOnHand(100);

        Orders o1 = new Orders();
        o1.setoId("O001");
        o1.setCustomer(c1);

        OrderDetail od = new OrderDetail();
        od.setOrder(o1);
        od.setItem(i1);
        od.setQty(5);


        Session session = FactoryConfiguration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(c1);
        session.save(i1);
       session.save(o1);
        session.save(od);

        transaction.commit();

        session.close();
    }
}
