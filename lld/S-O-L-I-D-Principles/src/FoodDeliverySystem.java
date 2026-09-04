
import java.util.*;

interface IFoodDeliveryService {
    void placeOrder(Order order);
    void cancelOrder(Order order);
}

class FoodDeliverySystem implements IFoodDeliveryService {

    NotificationService notificationService;
    DeliveryPartner deliveryPartner;
    Order order;
    PaymentService paymentService;
    Restaurant restaurant;
    SaveToDb db;

    public FoodDeliverySystem(NotificationService notificationService, DeliveryPartner deliveryPartner, Order order, PaymentService paymentService, Restaurant restaurant,SaveToDb db) {
        this.notificationService = notificationService;
        this.deliveryPartner = deliveryPartner;
        this.order = order;
        this.paymentService = paymentService;
        this.restaurant = restaurant;
        this.db = db;
    }

    public void placeOrder(Order order) {
       
         //process payment
         paymentService.processPayment();
        
         // order save to Db
         db.saveToDatabase();
         
         // order send notification
         notificationService.sendNotification();

        // generate invoice
        order.generateInvoice();
        
        // restaurant accept order
        // restaurant prepare order
        restaurant.acceptOrder(order);
        restaurant.prepareOrder(order);

       // assign Delivery partner
       deliveryPartner.assignDeliveryPartner();

       // deliver order
      deliveryPartner.deliver(order);
    }

    public void cancelOrder(Order order) {

        order.refundPayment();

        System.out.println("Order cancelled");
    }
}

