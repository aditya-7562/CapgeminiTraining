
enum OrderStatus {
    PLACED,
    PREPARING,
    OUT_FOR_DELIVERY,
    DELIVERED,
    CANCELED;

    private int code;
    private String message;

    OrderStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    OrderStatus() {
        // Default constructor
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

class Order{
    int orderId;
    OrderStatus status;

    public Order(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", status=" + status + "]";
    }
}

public class EnumP1 {
    public static void main(String[] args) {
        Order o1 = new Order(101, OrderStatus.CANCELED);
        Order o2 = new Order(102, OrderStatus.OUT_FOR_DELIVERY);
        Order o3 = new Order(103, OrderStatus.PLACED);

        System.out.println(o1);
    }
}
