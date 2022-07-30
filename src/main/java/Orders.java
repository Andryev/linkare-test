import domain.Order;

import java.util.*;

public final class Orders {


    private Map<Calendar, Order> orders = new HashMap<>();


    /**
     * Inserts an order.
     */
    public void pushOrder(Order order, Date date) {

        this.orders.put(toCalendar(date), order);

    }

    /**
     * Returns all orders in ascending order.
     */
    public Order[] getOrders() {

        List<Order> orders = new ArrayList<>();
        this.orders.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x -> orders.add(x.getValue()));

        return orders.toArray(new Order[0]);
    }

    /**
     * Return calendar to date conversion.
     */
    public static Calendar toCalendar(Date date){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal;
    }



}


