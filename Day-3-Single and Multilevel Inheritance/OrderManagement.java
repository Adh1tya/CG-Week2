
// Base class: Order
class Order {
    protected int orderId;
    protected String orderDate;
    
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    protected String trackingNumber;
    
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    
    @Override
    public String getOrderStatus() {
        return "Order shipped. Tracking Number: " + trackingNumber;
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    protected String deliveryDate;
    
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    
    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

// Main class to test the hierarchy
public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "2024-03-31");
        System.out.println(order.getOrderStatus());
        
        ShippedOrder shipped = new ShippedOrder(102, "2024-03-30", "TRK12345");
        System.out.println(shipped.getOrderStatus());
        
        DeliveredOrder delivered = new DeliveredOrder(103, "2024-03-29", "TRK67890", "2024-04-01");
        System.out.println(delivered.getOrderStatus());
    }
}

