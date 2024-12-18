package entites;

import entitiesEnum.OrderStatus;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static DateTimeFormatter fds = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item)
    {
        items.add(item);
    }
    public void removeItem(OrderItem item)
    {
        items.remove(item);
    }


    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + client.getAniversario());
        sb.append("\nOrder status: " + status+ "\n");
        sb.append("\nClient: " + client+"\n");
        sb.append("\nOrder items:\n");
        for(OrderItem c : items)
            sb.append(c + "\n");
        return sb.toString();
    }
}
