public class Main {
    public static void main(String[] args) {
       
    NotificationService notificationService = new NotificationService(new EmailNotification(),"ronit21102@gmail.com","7061414395");
    DeliveryPartner deliveryPartner =  new DeliveryPartner(new BikePartner());
    Order order = new Order(212,"ronit","ronit21102@gmail.com","7061414395");
    PaymentService paymentService = new PaymentService(new CardPayment());
    Restaurant restaurant = new Restaurant();
    OrderRepository Order = new OrderRepositoryImpl();
    FoodDeliverySystem fds = new FoodDeliverySystem(notificationService,deliveryPartner,order,paymentService,restaurant,Order);
    }
}
