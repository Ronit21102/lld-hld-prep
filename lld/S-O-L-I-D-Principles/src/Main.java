public class Main {
    public static void main(String[] args) {
       
    NotificationService notificationService = new NotificationService("EMAIL","ronit21102@gmail.com","7061414395");
    DeliveryPartner deliveryPartner =  new DeliveryPartner("BIKE");
    Order order = new Order(212,"ronit","ronit21102@gmail.com","7061414395");
    PaymentService paymentService = new PaymentService("CARD");
    Restaurant restaurant = new Restaurant();
    SaveToDb db = new SaveToDb(212 );
    FoodDeliverySystem fds = new FoodDeliverySystem(notificationService,deliveryPartner,order,paymentService,restaurant,db);
    }
}
