/* Q. Online Order Processing System
Each Order has:
	int orderId
	String customerName
	double orderAmount
	int itemCount
	long orderTime

Write a Java program to sort orders using Comparator based on:
	Higher orderAmount first
	If amount same → fewer itemCount first
	If itemCount same → earlier orderTime first
	If orderTime same → customerName in ascending order
	If customerName same → orderId in ascending order
*/

import java.util.*;

class Order {
    int orderId;
    String customerName;
    double orderAmount;
    int itemCount;
    long orderTime;

    public Order(int orderId, String customerName, double orderAmount, int itemCount, long orderTime) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
        this.itemCount = itemCount;
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", customerName=" + customerName + ", orderAmount=" + orderAmount
                + ", itemCount=" + itemCount + ", orderTime=" + orderTime + "]";
    }
}

class OrderComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        if (o1.orderAmount != o2.orderAmount) {
            return Double.compare(o2.orderAmount, o1.orderAmount); // Higher orderAmount first
        }
        if (o1.itemCount != o2.itemCount) {
            return Integer.compare(o1.itemCount, o2.itemCount); // Fewer itemCount first
        }
        if (o1.orderTime != o2.orderTime) {
            return Long.compare(o1.orderTime, o2.orderTime); // Earlier orderTime first
        }
        int nameCompare = o1.customerName.compareTo(o2.customerName);
        if (nameCompare != 0) {
            return nameCompare; // customerName in ascending order
        }
        return Integer.compare(o1.orderId, o2.orderId); // orderId in ascending order
    }
}

public class comparatorP1 {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(101, "Alice", 250.0, 3, 1622547800L));
        orders.add(new Order(102, "Bob", 300.0, 2, 1622547801L));
        orders.add(new Order(103, "Charlie", 250.0, 2, 1622547802L));
        orders.add(new Order(104, "David", 300.0, 2, 1622547799L));
        orders.add(new Order(105, "Eve", 250.0, 3, 1622547800L));
        orders.add(new Order(106, "Alice", 250.0, 3, 1622547800L));

        Collections.sort(orders, new OrderComparator());

        for (Order order : orders) {
            System.out.println(order);
        }

    }
}
